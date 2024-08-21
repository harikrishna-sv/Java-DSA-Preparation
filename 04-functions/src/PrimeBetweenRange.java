//Write a function that returns all prime numbers between two given numbers.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeBetweenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = in.nextInt();
        System.out.println("Enter the ending number: ");
        int end = in.nextInt();
        System.out.println("Prime numbers from " + start + " to " + end + " are: " + primes(start, end));
    }

    private static List<Integer> primes(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isprime(i))
                primes.add(i);
        }
        return primes;
    }

    private static boolean isprime(int start) {
        if (start <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(start); i++) {
            if (start % i == 0) {
                return false;
            }
        }
        return true;
    }
}
