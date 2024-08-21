package Easy;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double base = in.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = in.nextDouble();
        double area = (1.0/2) * base * height; //Using 1.0 instead of 1 to ensure floating-point division or use 0.5
        System.out.println("The area of Rectangle is: " + area);
    }
}
