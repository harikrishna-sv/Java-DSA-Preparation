package Medium;
//Java Program Vowel Or Consonant

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().toLowerCase().charAt(0);
      //  String result = ch.replaceAll("[^a-zA-Z]", "").toLowerCase();
//          The above method converts all the sentence into lowercase removing spaces & puncations & creates a new string i.e lower case.
        if (Character.isLetter(ch)) { // Character.isLetter(ch) method is used to check whether the ch is a letter or not.
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("The entered character " + ch + " is a Vowel:");
            } else
                System.out.println("The entered character " + ch + " is a consonant:");
        }
        if (Character.isDigit(ch)){ // Character.isDigit(ch) method is used to check whether the ch is a number or not.
            System.out.println("The entered character " + ch + " is a Number: ");
        }
        else
            System.out.println("Invalid character: ");
    }

}
