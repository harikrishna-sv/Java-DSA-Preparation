import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The sum of first " + n + " numbers are " + sumOfN(n));
}

    private static int sumOfN(int n) {
        return n*(n+1)/2;
    }
    }
