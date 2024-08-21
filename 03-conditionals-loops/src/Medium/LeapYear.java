package Medium;
//Check Leap Year Or Not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year to check whether it's a leap year or not: ");
        int n = in.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)){
            System.out.println("The entered year: " + n + " is a Leap year");
        }
        else
            System.out.println("The entered year: " + n + " is not a Leap year");
    }
}
