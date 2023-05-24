import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input of two number and print the sum
        System.out.print("Enter Num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = "+sum);   
    }
}
