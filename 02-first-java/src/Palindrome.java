//To find out whether the given String is Palindrome or not.

//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//        System.out.println("Enter any word or sentence or number: ");
//        Scanner input = new Scanner(System.in);
//        String word = input.nextLine();
//        String resultString = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //input.replaceAll("[\\W_]", "").toLowerCase();
//        int left = 0;
//        int right = resultString.length() - 1;
//        boolean ispalindrome = true;
//        while (left < right) {
//            if (resultString.charAt(left) != resultString.charAt(right)) {
//                ispalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if (ispalindrome) {
//            System.out.println("Entered " + word + " is a Palindrome");
//        }
//        else
//            System.out.println("Entered " + word + " is not a Palindrome");
//    }
//}

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String result = input.replaceAll("[\\W_]", "").toLowerCase();
        if(isPalindrome(result))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    private static Boolean isPalindrome(String result) {
        int left = 0;
        int right = result.length()-1;
        while(left < right){
            if(result.charAt(left) != result.charAt(right)){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }
}