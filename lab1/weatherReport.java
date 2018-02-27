package PSC.lab1;

import java.util.Scanner;

public class weatherReport {
    public static void main(String args[]){
        printWeatherReport();
    }

    public static void printWeatherReport(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the current temperature: ");
        int weather = sc.nextInt();
        if(weather >= 0 && weather <= 8){
            System.out.println("It is cold outside, bring a jacket!");
        }
        else if(weather >= 9 && weather <= 16){
            System.out.println("The sun is coming out, and it is getting warmer!");
        }
        else if(weather >= 17 && weather <= 32){
            System.out.println("Time to sit beside the pool and relax!");
        }
        else if(weather >= 33 && weather <= 45){
            System.out.println("Too hot, can't move!");
        }
        else{
            System.out.println("Not a valid number!");
        }
    }
}
