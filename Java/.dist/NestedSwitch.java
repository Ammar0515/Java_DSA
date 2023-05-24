import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        /*
        switch (empID) {
            case 1:
                System.out.println("Ammar Shaikh");
                break;
            case 2:
                System.out.println("Noaman Shaikh");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department ");
                        break;
                    case "Management":
                        System.out.println("Management department");
                    default:
                        System.out.println("no department Entered");
                        break;
                }
                break;
            default:
                System.out.println("Enter Correcr ID");
                break;
        }
        */
        // Better way to Write
        switch (empID) {
            case 1 -> System.out.println("Ammar Shaikh");
            case 2 -> System.out.println("Nomaan Shaikh");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("no department Entered");
                }
            }
            default -> System.out.println("no department Entered");    
        }
    }
}
