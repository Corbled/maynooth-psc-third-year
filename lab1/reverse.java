package PSC.lab1;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String param = sc.nextLine();
        System.out.println(reverseString(param));
    }
    private static String reverseString(String param){
        String reversed = "";
        for(int i = param.length()-1; i >=0; i--){
            reversed += param.charAt(i);
        }
        return reversed;
    }
}
