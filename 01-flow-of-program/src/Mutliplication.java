import java.util.Scanner;

// Take a number as input and print the multiplication table for it.
public class Mutliplication {
    public static void main(String[] args) {
        System.out.println("Enter any number & it will return multiplication of that:  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
