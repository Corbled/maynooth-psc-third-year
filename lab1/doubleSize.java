package PSC.lab1;

import java.util.Scanner;

public class doubleSize {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two doubles: ");
        double first = sc.nextDouble(), second = sc.nextDouble();
        determineSize(first, second);
    }

    private static void determineSize(double one, double two){
        if(one > two){
            System.out.println("Largest = " + one + "\n" + "Smallest = " + two);
        }
        else if(two > one){
            System.out.println("Largest = " + two + "\n" + "Smallest = " + one);
        }
        else{
            System.out.println("These numbers are the same");
        }

    }
}
