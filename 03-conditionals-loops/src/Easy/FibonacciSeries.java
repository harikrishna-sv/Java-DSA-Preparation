package Easy;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the any number: ");
        int n = in.nextInt();
        int first = 0;
        int second = 1;
        //int result =
        for (int i = 0; i < n; i++) {
            System.out.println(first);
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
