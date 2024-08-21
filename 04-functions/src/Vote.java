//
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
//


import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("This person is " + vote(a) + " to vote.");
}

    private static String vote(int a) {
        if(a >= 18)
            return "Eligible";
        else
            return "Not Eligible";
    }
    }

