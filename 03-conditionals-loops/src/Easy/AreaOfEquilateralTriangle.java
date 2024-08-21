package Easy;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle: ");
        double side = in.nextDouble();
        double area = Math.sqrt(3.0)/4 * Math.pow(side, 2);
        System.out.println("The area of Rectangle is: " + area);
    }
}
