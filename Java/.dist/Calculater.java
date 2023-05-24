import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int ans = 0;
            while (true) {
                System.out.print("Enter the Operater: ");
                char op = in.next().trim().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    // Enter two Numbers
                    System.out.print("Enter Two Number: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }

                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid Operation");
                }
                System.out.println(ans);
                System.out.println("Press X or x to End the Operation...");
            }
        }
    }
}
