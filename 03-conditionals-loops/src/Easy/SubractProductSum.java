package Easy;

import java.util.Scanner;

public class SubractProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to subtract the product & sum of an integer");
        int n = in.nextInt();
        int productResult = 1; // Initialize productResult to 1 instead of 0. if I use 0 no matter how many times the loop runs it is 0
        int sumResult = 0;
        while(n != 0){
            int temp = n % 10;
            productResult *= temp;
            sumResult += temp;
            n /= 10;
        }
        int subtractResult = productResult - sumResult;
        System.out.println(subtractResult);

    }
}
