import java.util.Scanner;

/**
 * Reverse
 * if the input is 12345
 * then it will take the remainder and multiply it by 10
 * and add second last num
 * ex.. input = 12345
 * 5 * 10 + 4 =54
 * 54 * 10 + 3 =543
 * 543 * 10 + 2 = 5432
 * 5432 * 10 + 1 = 54321
 * // if you divide the num by 10 it will you the last number as remainder.
 * 6789 % 10 = 9;
 * 678 % 10 = 8;
 * 67 % 10 = 7;
 * 7 % 10 = 0;
 */
public class Reverse {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}