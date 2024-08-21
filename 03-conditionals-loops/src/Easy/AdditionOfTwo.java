package Easy;

import java.util.Scanner;

//Addition Of Two Numbers
public class AdditionOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = in.nextInt();
        System.out.println("Enter the second number: ");
        int second = in.nextInt();
       // int result = first + second;
        System.out.println("The sum of two numbers is: " + (first + second));
    }
}
