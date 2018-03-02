package PSC.lab1;

import java.util.Scanner;

public class starTriangle {


    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the desired amount of starts: ");
        int stars = sc.nextInt();
        printStarTriangle(stars);
    }

    public static void printStarTriangle(int stars) {
        for (int j = 1; j <= stars; j++) {
            for (int i = 1; i <= j; i++) {

                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
