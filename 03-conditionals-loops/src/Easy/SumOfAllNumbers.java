package Easy;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = in.nextInt();
            sum += n;
            if(n == 0)
                break;
        }
        if(sum != 0)
            System.out.println("The sum of all numbers are: "+ sum);
        else
            System.out.println("No numbers were entered: ");
    }
}
