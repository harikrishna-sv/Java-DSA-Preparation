//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = min(a, b, c);
        int max = maxv(a, b, c);
        System.out.println("The minimum & maximum numbers between " + a + ", " + b + ", " + c + " are " + " min: " + min + " max: "+ max );
}

    private static int maxv(int a, int b, int c) {
        if((a>b) && (a>c))
            return a;
        if((b>a) && (b>c))
            return b;
        else
            return c;
      // use this one line method  return Math.max(Math.max(a, b), c);
    }

    private static int min(int a, int b, int c) {
        if((a<b) && (a<c))
            return a;
        if((b<a) && (b<c))
            return b;
        else
            return c;
        // use this one line method return Math.min(Math.min(a, b), c);
    }
    }
