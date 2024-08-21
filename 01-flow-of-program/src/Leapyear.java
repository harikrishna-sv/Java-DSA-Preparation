import java.util.Scanner;

// Input a year and find whether it is a leap year or not.
public class Leapyear {
    public static void main(String[] args) {
        System.out.print("Enter a year to check whether it is a leap year or not: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year != 0){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " is a leap year");
            }
            else
                System.out.println(year + " is not a leap year");
        }
        else
            System.out.println("Please enter a valid year");
    }
}
