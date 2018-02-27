package com.lab3;

import java.util.Scanner;

public class whichRegEx {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a String: ");
            String param = sc.nextLine();
            which(param);
            sc.close();
        }
        public static void which(String param){
            if (param.matches("a(b|a)b")){
                System.out.println("1");
            }
            if (param.matches("(ab)*b")){
                System.out.println("2");
            }
            if (param.matches("a(b|a)*")){
                System.out.println("3");
            }
            if (param.matches("((a|b)a)*")){
                System.out.println("4");
            }

            if(!(param.matches("a(b|a)b")||param.matches("(ab)*b")||param.matches("a(b|a)*")||param.matches("((a|b)a)*"))) {
                System.out.println("Not in the language");
            }

        }
}
