package Easy;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int base = in.nextInt();
        System.out.println("Enter the power value: ");
        int power = in.nextInt();
        double result = Math.pow(base, power);
        System.out.println("The power of " + base +"^" + power + " is " + result);
    }
}
