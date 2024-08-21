//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.print("Enter the name to print greeting message: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome "+ name + " to DSA bootcamp: \uD83D\uDE03");
    }
}
