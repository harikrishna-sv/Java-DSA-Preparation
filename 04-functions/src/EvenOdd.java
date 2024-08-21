//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + " is a " + even(n) + " number");
    }
    static String even(int n) {
        if(n % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
}
