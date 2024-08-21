import java.util.Scanner;

//34.    E D C B A
//       D C B A
//       C B A
//       B A
//       A
public class P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int a = in.nextInt();
        for (int i = 1; i <= a ; i++) {
            if(i % 2 != 0) {
                System.out.print(i + "-" + (i + 1) + ", ");
            }
        }
    }

}
