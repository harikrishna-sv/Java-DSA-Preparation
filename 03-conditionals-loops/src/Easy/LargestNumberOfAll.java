package Easy;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestNumberOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0; // instead of this we can use the method Integer.MIN_VALUE; -Initialize maxNumber to the smallest possible integer
        while(true){
            int n = in.nextInt();
            if(n == 0){
                break;
            }
            if(n > result){
                result = n;
            }
        }
        if(result != 0)
            System.out.println("The sum of all numbers are: " + result);
        else
            System.out.println("No numbers were entered: ");
    }
}
