//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Please enter the number to display the Fibonacci series: ");
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int fibonacci = input.nextInt();
        for (int i = 0; i < fibonacci ; i++) {
            System.out.println(first);
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
