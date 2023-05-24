import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {
        // String massage = greet();
        // System.out.println(massage);
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        String persn = mygreet(name);
        System.out.print(persn);
        System.out.print(greet());
    }

    static String mygreet(String name) {
        String massage  = "hello " + name; 
        return massage;
    }

    static String greet() {
        String Greeting = " How are you";
        return Greeting;
    }
}
