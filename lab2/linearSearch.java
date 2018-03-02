package PSC.lab2;

import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double ar[] = fillArray();
        System.out.println("What number would you like to search for in the array: ");
        double num = scan.nextDouble();
        print(findElement(ar, num), num);
    }

    private static boolean findElement(double[] ar, double num){
        boolean found = false;
        for(int track = 0; track < ar.length; track++){
            if(ar[track] == num){
                found = true;
            }
        }
        return found;
    }

    private static double[] fillArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        double ar[] = new double[scan.nextInt()];
        System.out.println("Please enter doubles to fill the array: ");
        for(int index = 0; index < ar.length;index++) {
            ar[index] = scan.nextDouble();
        }
        return ar;
    }

    private static void print(boolean found, double num){
        if(found){
            System.out.println(num + " was found in the array");
        }
        else
            System.out.println(num + " was NOT found in the array");
    }
}
