package Easy;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("The area of Rectangle is: " + area);
    }
}
