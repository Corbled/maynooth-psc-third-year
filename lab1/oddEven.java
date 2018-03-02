package PSC.lab1;

import java.util.Scanner;

public class oddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer please: ");
        int param = sc.nextInt();
        if(param < 0) {
            System.out.println("Not a valid entry!");
        }
        else {
            System.out.println(isEven(param) ? "Even" : "Odd");
        }
    }
    private static boolean isEven(int param){

        boolean even = param%2==0 ? true:false;
        return even;
    }
}
