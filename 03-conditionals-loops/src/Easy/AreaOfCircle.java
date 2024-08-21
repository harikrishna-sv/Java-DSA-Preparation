package Easy;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius for the circle: ");
        int r = in.nextInt();
        double a = (Math.PI) * Math.pow(r, 2);
        System.out.println("The area of circle is: " + a);
    }
}

