//Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double exchangeRate = 0.012;
        System.out.print("Enter the currency in Rs/- & will return it into USD: ");
        Scanner input = new Scanner(System.in);
        double currency = input.nextDouble();
        double result = currency * exchangeRate;
        System.out.println("The exchange rate for the INR: " + currency + " is " + " USD: " + result);
    }
}

