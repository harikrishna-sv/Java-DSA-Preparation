// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = obj.nextInt();
        System.out.print("Enter the second number: ");
        int b = obj.nextInt();
        int hcf = hcf(a,b);
        int lcm = lcm(a,b,hcf);
        System.out.println("HCF of "+ a + " & " + b + " " + "is " + hcf);
        System.out.println("LCM of "+ a + " & " + b + " " + "is " + lcm);
    }

    private static int lcm(int a, int b, int hcf) {
        return (a * b)/hcf;
    }

    private static int hcf(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
