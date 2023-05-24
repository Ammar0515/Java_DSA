import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    // Return the Value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
        // System.out.println("This will never execute");
        // after return fuction its over nothing will execute after that.
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    /*
     * Access Modifier(w'll Look it in OOPS) return_type name (){
     * // body
     * return statement;
     * }
     * 
     */
}
