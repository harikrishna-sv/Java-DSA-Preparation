//Define a method that returns the product of two numbers entered by user.
//
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//

import java.util.Scanner;

public class TwoProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The product of " + a + ", " + b +" is " + twoProduct(a, b));
}

    private static int twoProduct(int a, int b) {
        return a*b;
    }
    }
