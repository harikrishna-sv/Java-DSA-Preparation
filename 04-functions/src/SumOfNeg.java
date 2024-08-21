//Write a program to print the sum of negative numbers, sum of positive even numbers
// and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class SumOfNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sumNegative = 0, sumPositiveEven = 0, sumPositiveOdd = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        do {
            num = scanner.nextInt();
            sumNegative = addIfNegative(num, sumNegative);
            sumPositiveEven = addIfPositiveEven(num, sumPositiveEven);
            sumPositiveOdd = addIfPositiveOdd(num, sumPositiveOdd);
        } while(num != 0);

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }

    public static int addIfNegative(int num, int sum) {
        if(num < 0) {
            sum += num;
        }
        return sum;
    }

    public static int addIfPositiveEven(int num, int sum) {
        if(num > 0 && num % 2 == 0) {
            sum += num;
        }
        return sum;
    }

    public static int addIfPositiveOdd(int num, int sum) {
        if(num > 0 && num % 2 != 0) {
            sum += num;
        }
        return sum;
    }
}
