//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println("Enter the operator: ");
        char operator = input.next().charAt(0);
        if (operator == '+'){
            System.out.println("The addition of two numbers is: " + (first + second));
        }
        else if (operator == '-'){
            System.out.println("The addition of two numbers is: " + (first - second));
        }
        else if (operator == '*'){
            System.out.println("The addition of two numbers is: " + (first * second));
        }
        else if (operator == '%'){
            System.out.println("The addition of two numbers is: " + (first % second));
        }
        else if (operator == '/'){
            if (second > 0) {
                System.out.println("The addition of two numbers is: " + (first / second));
            }
            else
                System.out.println("Denominator must be greater than 0");
        }
        else
            System.out.println("Invalid operation: ");
        }
    }
