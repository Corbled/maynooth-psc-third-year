package PSC.lab2;

import java.util.Scanner;

public class methodsArrays {
    public static void main(String args[]){

        int ar[] = fillArray();
        System.out.println("The sum of the array is: " + sumArray(ar));
        System.out.println("The array average is: " + avgArray(ar));
        printArray(ar);
    }

    public static int[] fillArray(){
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[scan.nextInt()];
        for(int index = 0; index < ar.length;index++) {
            ar[index] = scan.nextInt();

        }
        return ar;
    }

    public static int sumArray(int[] ar){
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }

    public static double avgArray(int[] ar){
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum/ar.length;
    }

    public static void printArray(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i] + " ");
        }
    }
}
