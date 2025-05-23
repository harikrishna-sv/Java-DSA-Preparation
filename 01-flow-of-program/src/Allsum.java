//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class Allsum {
   static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter numbers as much you can & press X to return the sum of it");
        sumOfAll();

    }

    private static void sumOfAll() {
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
                  //  break;
                }
                else
                 System.out.println("invalid input");
                }
            }

        }
        
    }
