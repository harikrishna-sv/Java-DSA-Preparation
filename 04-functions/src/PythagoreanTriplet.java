//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
//

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(a + ", " + b + ", " + c + " are " + pythagoreanTriplet(a, b, c));
}

    private static String pythagoreanTriplet(int a, int b, int c) {
        if((a*a) + (b*b) == (c*c))
            return "Pythagorean triplet";
        else
            return "Not a Pythagorean triplet";

    }
    }
