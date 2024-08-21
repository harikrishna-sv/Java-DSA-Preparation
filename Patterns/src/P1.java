//5.  *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int a = in.nextInt();
        // Upper part of the body
        for (int i = 1; i <= a; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Lower part of the body
        for (int k = a - 1; k >= 1 ; k--) {
            for (int l = 1; l <= k ; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
