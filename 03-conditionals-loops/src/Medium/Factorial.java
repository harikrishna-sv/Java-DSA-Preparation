package Medium;
//Factorial Program In Java

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please do enter a number to find out the factorial: ");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        System.out.println(fact);
        in.close();
    }
}
