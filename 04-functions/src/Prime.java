//Define a method to find out if a number is prime or not.
// it should be greater than 1 & it has only two factors i.e 1 & the number itself.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + " is a " + prime(n));
    }

    private static String prime(int n) {
       if(n <= 1)
           return "Not a Prime:";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return "Not a Prime:";
        }
        return "Prime:";
       }
    }
