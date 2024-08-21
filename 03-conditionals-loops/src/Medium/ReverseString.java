package Medium;
//Reverse A String In Java

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string to reverse: ");
        String str = in.nextLine();
        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            char index = str.charAt(i);
            result += index;
        }
        System.out.println(result);
    }
}
