package PSC.lab1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two int values to create a range: ");
        int low = sc.nextInt(), high = sc.nextInt();
        while(low<=high){
            if(isItPrime(low)){
                System.out.println(low);
            }
            low++;
        }
    }
    public static boolean isItPrime(int param){
        for(int i =2; i<param; i++) {
            if (param%i==0){
                return false;
            }
        }
        return true;
    }
}
