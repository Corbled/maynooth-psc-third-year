package com.lab3;

import java.util.Scanner;

public class flightCodesRegEx {
    public static void main(String args[]){
        code();
    }

    private static void code(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your flight code: ");
        String param = sc.nextLine();

        //verify that flight code begins with 2 or 3 capital letters followed by 3 or 4 digits
        if(param.matches("[A-Z]{2,3}[0-9]{3,4}")){
            System.out.println("Flight code is valid");
        }
        // If not request flight code again
        else{
            System.out.println("Flight code is NOT valid");
            code();
        }
        sc.close();

    }
}
