package PSC.lab2;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two variables to create a range: ");
        int n = sc.nextInt(), m = sc.nextInt();
        getFactorial(n,m);
        sc.close();
    }

        public static void getFactorial(int n, int m){
            int fac = 1;

            for(int start = 1; start <= n ;start++){
                fac = fac*start;

            }
            System.out.println(fac);
            if(n<m){
                getFactorial(n+1, m);
            }

        }
}
