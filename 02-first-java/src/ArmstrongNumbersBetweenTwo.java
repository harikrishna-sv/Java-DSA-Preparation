//To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmstrongNumbersBetweenTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        // int result = 0;
        System.out.println("The Armstrong numbers between " + a + " and " + b + " are: ");
        for (int i = a; i <= b; i++) {
            int originalNumber = i;
            int result = 0;
            int temp = i;
            // Convert 'a' to a string to iterate over its digits
            String strA = String.valueOf(i);
            //another way to get the count of a has n numbers int numDigits = (int) Math.floor(Math.log10(a)) + 1
            int pow = strA.length();
            while (temp != 0) {
                int digit = temp % 10; // gives the remainder
                result += Math.pow(digit, pow);
                temp /= 10; // removes the last digit
            }
            if(originalNumber == result){
                System.out.println(result);
            }
        }
    }
}
