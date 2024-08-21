package Medium;
//Armstrong Number In Java

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = in.nextInt();
        System.out.println("The entered number is " + armstrong(a));
    }

    private static String armstrong(int a) {
        int orgN = a;
        int sum = 0;
        String str = String.valueOf(a);
        int pow = str.length();
        for (int i = 0; i < pow; i++) {
            int temp = a % 10;
            sum += Math.pow(temp, pow);
            a = a/10;
        }
        if(orgN == sum) {
            return "a Armstrong Number";
        }
        return "NOT a Armstrong Number";

    }
}
