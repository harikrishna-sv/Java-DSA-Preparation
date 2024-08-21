package Medium;
//Power In Java

// First method
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a base to calculate it's power: ");
        long base = in.nextInt();
        System.out.println("Enter a exponent to calculate it's power: ");
        int exponent = in.nextInt();
        long power = (long) Math.pow(base, exponent);
     //   long result = power;
        System.out.println(power);
    }
}

//Second Method

//import java.util.Scanner;
//
//public class Power {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a base to calculate it's power: ");
//        long base = in.nextLong();
//        System.out.println("Enter a exponent to calculate it's power: ");
//        int exponent = in.nextInt();
//        long power = 1;
//        for (int i = 1; i <= exponent ; i++) {
//            power *= base;
//        }
//        System.out.println(power);
//    }
//}