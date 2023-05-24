import java.util.Scanner;

/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        // String Fruit =  in.next();
        // switch (Fruit) {
        //     case "Mango":
        //         System.out.println("King of Fruits");
        //         break;
        //     case "Apple" :
        //         System.out.println("Doctors favorite Fruit");
        //         break;
        //     case "Orange" :
        //         System.out.println("Round shape Fruit");
        //         break;
        //     case "Grapes" :
        //         System.out.println("Small Fruit");
        //     default:
        //         System.out.println("Enter Correct fruit!!!");
        //         break;
        // }
        // This is a more Clean way to write a switch case also known as enhanced Switch case
        // break are included by default.
        /*
        switch (Fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Doctors favorite Fruit");
            case "Orange" -> System.out.println("Round shape Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter Correct fruit!!!");
        }
        */
        int Days  = in.nextInt();  
        // switch (Days) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Enter Valid Number!!!");
        // }
        switch (Days) {
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
            default -> System.out.println("Enter Valid Number!!!");
        }
    }
}