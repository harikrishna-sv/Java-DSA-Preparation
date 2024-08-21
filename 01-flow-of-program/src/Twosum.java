import java.util.Scanner;

// Take two numbers and print the sum of both.
public class Twosum {
    public static void main(String[] args) {
        System.out.print("Enter any two numbers: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println("The sum of two numbers is: " + (first + second));
    }

}
