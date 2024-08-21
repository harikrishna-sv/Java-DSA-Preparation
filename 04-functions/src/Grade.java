//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks out of 100 in Telugu: ");
        int t = in.nextInt();
        System.out.println("Enter the marks out of 100 in Hindi: ");
        int h = in.nextInt();
        System.out.println("Enter the marks out of 100 in English: ");
        int e = in.nextInt();
        System.out.println("Enter the marks out of 100 in Maths: ");
        int m = in.nextInt();
        System.out.println("Enter the marks out of 100 in Science: ");
        int sc = in.nextInt();
        System.out.println("Enter the marks out of 100 in Social: ");
        int so = in.nextInt();

        System.out.println("The total marks in all subjects: " + (t + e + h + m + sc + so) + " & Grade: "+ grade(t, e, h, m, sc, so));
}

    private static String grade(int t, int e, int h, int m, int sc, int so) {
        int result = ((t + e + h + m + sc + so) * 100) / 600;
        boolean min = (t > 40 && e > 40 && h > 40 && m > 40 && sc > 40 && so > 40); // check each sub should have min marks of above 40
        if((result >= 91 && result <= 100) && min) {
            return "AA";
        }
        else if((result >= 81 && result <= 90)  && min) {
            return "AB";
        }
        else if((result >= 71 && result <= 80) && min) {
            return "BB";
        }
        else if((result >= 61 && result <= 70)  && min) {
            return "BC";
        }
        else if((result >= 51 && result <= 60)  && min) {
            return "CD";
        }
        else if((result >= 41 && result <= 50) && min) {
            return "DD";
        }
        return "FAIL";
    }
    }
