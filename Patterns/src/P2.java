//12.  * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int a = in.nextInt();
        // Upper part of the body
        for (int i = 0; i < a ; i++) {
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            for (int j = a; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the body
        for (int i = 0; i < a ; i++) {
            for (int k = 0; k < a - i -1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
