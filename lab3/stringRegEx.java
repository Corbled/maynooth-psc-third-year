package com.lab3;

import java.util.Scanner;

public class stringRegEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String param = sc.nextLine();
        System.out.println(accept(param));
        sc.close();
    }
    public static boolean accept(String param){
        //True if input is exclusively composed of 0's and 1's
        return param.matches("[0-1]*" );

    }
}
