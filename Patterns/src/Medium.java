import java.util.Scanner;

public class Medium {
    public String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
 //       s = s.trim();

        // Split the string by one or more spaces
        String[] words = s.split("\\s+");

        // Use a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Medium solution = new Medium();
        Scanner obj = new Scanner(System.in);
        String s =obj.nextLine();
        String reversed = solution.reverseWords(s);
        System.out.println(reversed); // Output: "blue is sky the"
    }
}

