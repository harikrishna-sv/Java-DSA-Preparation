//Write a program to print whether a number is even or odd, also take input from the user.


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number to find its even or odd: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("The entered number: " + number + " is Even");
        }
        else
            System.out.println("The entered number: " + number + " is odd");
    }
}
// Another logic for this is (number/2) * 2 == number it is Even