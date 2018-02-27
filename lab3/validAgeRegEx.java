package com.lab3;

import java.util.Scanner;

public class validAgeRegEx {
    public static void main(String args[]){

        valid();

    }
    public static void valid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        String param = sc.nextLine();

        /*
        Match numbers from 0-150. The first [0-9] is for the numbers 0-9. [1-9][0-9] for numbers
        10-99. 1[0-5][0] for 100-150. This is needed as [0-150] only actually matches [0-1] since it matches strings and
        treats 150 as 3 separate characters matching the the first.
         */
        if(param.matches("[0-9]|[1-9][0-9]|1[0-5][0]")){
            System.out.println("Age is valid");
        }
        // Else retry
        else{
            System.out.println("Age is NOT valid");
            valid();
            System.out.println("What if the age is somewhat valid yet we cannot allow the");
        }

    }
}
