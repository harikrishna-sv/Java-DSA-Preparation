//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumberOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers: ");
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        if (first > second)
            System.out.println("The largest of two numbers is: " + first);
        else
            System.out.println("The largest of two numbers is: " + second);

    }
}
