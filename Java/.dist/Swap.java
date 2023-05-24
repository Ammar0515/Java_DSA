import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        // Swap numbers code

        int temp = a;
        a = b;
        b = temp;

        System.out.println("num1 : " + a + " " + " num2 : " + b);
    }
}
