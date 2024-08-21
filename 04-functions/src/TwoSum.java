//Write a program to print the sum of two numbers entered by user by defining your own method.
//

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The sum of " + a + ", " + b +" is " + twoSum(a, b));
}

    private static int twoSum(int a, int b) {
        return a+b;
    }
    }
