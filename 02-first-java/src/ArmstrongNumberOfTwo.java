//To find given number is  Armstrong Number or not.

import java.util.Scanner;

public class ArmstrongNumberOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int originalNumber = a;
        //int b = input.nextInt();
        int result = 0;
        // Convert 'a' to a string to iterate over its digits
        String strA = String.valueOf(a);
        //another way to get the count of a has n numbers int numDigits = (int) Math.floor(Math.log10(a)) + 1
        int pow = strA.length();
        while(a > 0) {
            int temp = a % 10; // gives the remainder
            result += Math.pow(temp, pow); //if we want use power
            a /= 10; // removes the last digit
        }
        if (result == originalNumber){
            System.out.println("Entered number " + originalNumber + " is a Armstrong Number");
        }
        else
            System.out.println("Entered number " + originalNumber + " is not a Armstrong Number");
    }
}
