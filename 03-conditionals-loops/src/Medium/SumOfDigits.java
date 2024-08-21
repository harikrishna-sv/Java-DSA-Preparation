package Medium;

import java.util.Scanner;
//Sum Of A Digits Of Number

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to calculate sum of digits: ");
        long n = in.nextLong();
        String strn = String.valueOf(n);
        long result = 0;
        for (int i = 0; i <= strn.length(); i++) {
           long temp = n % 10;
            //long temp = strn.charAt(i);
            result += temp;
            n /= 10;
        }
        System.out.println("The sum of digits are: " + result);
    }
}