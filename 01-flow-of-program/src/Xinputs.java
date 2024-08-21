//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Xinputs {
    public static void main(String[] args) {
        System.out.println("Enter numbers & press x to stop & return the sum:");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
             if (input.hasNextInt()){
                 int number = input.nextInt();
                 sum += number;
             }
             else {
                 String str = input.next();
                 if (str.equalsIgnoreCase("x")) {
                     System.out.println("The sum of all numbers is: " + sum);
                     break;
                 }
                 else {
                     System.out.println("Invalid input. Please enter a valid number or 'x' to stop. ");
                 }
             }
        }

    }
}
