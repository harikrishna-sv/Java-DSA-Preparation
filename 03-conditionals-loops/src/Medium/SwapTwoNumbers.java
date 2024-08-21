package Medium;
// Swap two numbers without temporary variable
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The Swapped Numbers are: " + a + " " + b);
    }
}
