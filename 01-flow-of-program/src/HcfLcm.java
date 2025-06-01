//// Take more numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }


        int hcf = arr[0];
        for (int i = 1; i < n; i++) {
            hcf = Cal_hcf(hcf, arr[i]);
        }

        int lcm = arr[0];
        for (int i = 1; i < n; i++) {
            lcm = Cal_lcm(lcm, arr[i]);
        }
        System.out.println("The HCF is: " + hcf);
        System.out.println("The LCM is: " + lcm);
    }
    private static int Cal_hcf(int a, int b) {
        if(b == 0){
            return a;
        }
        return Cal_hcf(b,a%b);
    }
    private static int Cal_lcm(int a, int b) {
        return (a * b) / Cal_hcf(a, b);
    }

}
//// Take 2 numbers as inputs and find their HCF and LCM.
//
////import java.util.Scanner;
////
////public class HcfLcm {
////    public static void main(String[] args) {
////        Scanner obj = new Scanner(System.in);
////        System.out.print("Enter the first number: ");
////        int a = obj.nextInt();
////        System.out.print("Enter the second number: ");
////        int b = obj.nextInt();
////        int hcf = hcf(a,b);
////        int lcm = lcm(a,b,hcf);
////        System.out.println("HCF of "+ a + " & " + b + " " + "is " + hcf);
////        System.out.println("LCM of "+ a + " & " + b + " " + "is " + lcm);
////    }
////
////    private static int lcm(int a, int b, int hcf) {
////        return (a * b)/hcf;
////    }
////
////    private static int hcf(int a, int b) {
////        while(b != 0){
////            int temp = b;
////            b = a % b;
////            a = temp;
////        }
////        return a;
////    }
////}
