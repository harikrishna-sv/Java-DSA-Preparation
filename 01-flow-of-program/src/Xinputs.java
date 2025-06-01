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

//one more logic
//import java.util.Scanner;
//
//public class Xinputs {
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter a number (or 'x' to stop):");
//            String input = obj.next(); // Take input as a String
//
//            // Check if the input is 'x'
//            if (input.equalsIgnoreCase("x")) {
//                break; // Exit the loop if 'x' is entered
//            }
//
//            try {
//                // Convert the input to an integer and add to sum
//                int num = Integer.parseInt(input);
//                sum += num;
//            } catch (NumberFormatException e) {
//                // If input is not a number, print error message
//                System.out.println("Invalid input. Please enter a valid number.");
//            }
//        }
//
//        System.out.println("The sum of all numbers is: " + sum); // Print the sum
//
//        obj.close(); // Close the scanner
//    }
//}
