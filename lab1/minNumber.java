package PSC.lab1;
import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println(minFunction(n1,n2,n3) + " is the smallest number");
    }

    private static int minFunction(int n1, int n2, int n3){
        if(n1>n2 && n1 > n3){
            return n1;
        }
        else if(n2>n3 && n2 > n1){
            return n2;
        }
        else{
            return n3;
        }
    }
}
