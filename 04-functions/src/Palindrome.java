//Write a function to find if a number is a palindrome or not. Take number as parameter.
//

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = String.valueOf(n);
        System.out.println(n + " is " + palindrome(str));
}

    private static String palindrome(String str) {
        int left = 0;
        int right = str.length() -1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return "Not a Palindrome:";
            }
            left++;
            right--;
        }
        return "Palindrome:";
    }
    }
