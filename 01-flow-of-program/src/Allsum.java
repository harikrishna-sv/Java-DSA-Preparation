//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class Allsum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers as much you can & press X to return the sum of it");
        sumOfAll();

    }

    private static void sumOfAll() {
        int sum = 0;
        while(true) {
            int num = obj.nextInt();
            sum += num;
            if(num == x)
        }
    }
}
