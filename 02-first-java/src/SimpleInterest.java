//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Please enter the principal amount to calculate the Interest: ");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        System.out.println("Please enter the time period to calculate the Interest in years: ");
        double years = input.nextDouble();
        double time = years * 12;
        System.out.println("Please enter the rate of interest to calculate the Interest: ");
        double rateOfInterest = input.nextDouble();
        double totalInterest = (principal/100) * rateOfInterest * time;
        System.out.println("The total interest acquired for " + time + " months is " + totalInterest);
    }
}
