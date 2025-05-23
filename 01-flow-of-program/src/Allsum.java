//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class Allsum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers as much you can & press X to return the sum of it");
        sumOfAll(obj);
    }

    private static void sumOfAll(Scanner obj) {
        int sum = 0;
        while(true) {
            if(obj.hasNextInt()){
                int num = obj.nextInt();
                sum += num;
            }
            else{
                String input = obj.next();
                if(input.equalsIgnoreCase("x")){
                    System.out.println("Sum of all the numbers are: " + sum);
                   break; //If you won't break it will leads to an infinite loop even after entering x.
                }
                else
                 System.out.println("invalid input");
                }
            }
        } 
    }
