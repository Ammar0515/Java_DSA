import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         char ch = in.next().trim().charAt(0);
         //System.out.println(ch);
        // trim() Remove the extra space 
        // chatAt() is basically coverting a string into char.
        // charAt(0) means give me the '0' index of the String.
      /*   String word = "Namaste";
        System.out.println(word.charAt(5));
        // charAt basically returning the data type.
      */

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }

        /*
        int a = 10 ;
        int b = 20;
        if(a == 10 && b == 20){
            System.out.println("Hello world");
        }
        // '&&' this is called "and" .
        // Both of this conndition should be true so you can  use '&&'.
        //  a == 10 and b == 20 if both condition will match then only the program will run.
        */

        /*
         int a = 10;
         int b = 40;
         if(a == 10 || b == 20){
             System.out.println("Hello world");
         }
         // '||' ths is called "or" .
        // '||' means either one of the condition should be true.
        // this '&' and '||' are the "bitwise Opraters".
        */
        
        /*
        int a = 10;
        int b = 40;
        if(a != 35){
            System.out.println("Hello world");
        }
        // means 'a' should not be equal to 35 if thats true then print.
        */
    }
}
