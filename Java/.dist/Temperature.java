 import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Plese Enter temp in c : ");
        Float tempC = in.nextFloat();

        Float tempF = (tempC * 9 / 5) + 32;
        // Beacuse of type promotion float will overight the value of int so the answer
        // will always be in float.
        System.out.println(tempF);
    }
}