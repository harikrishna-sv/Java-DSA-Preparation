import java.util.Scanner;

public class SequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize the starting values
        int start = 1;
        int end = 2;

        // Generate the sequence
        while (start <= n) {
            // Output the current pair
            System.out.print(start + "-" + end);

            // Check if we need to print a comma
            if (end + 4 <= n) {
                System.out.print(", ");
            }

            // Increment the start and end values
            start += 4;
            end += 4;
        }

        // Close the scanner
        scanner.close();
    }
}
