import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; // beacuse fibonacci is addition of 2 number.
        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp; // we are using 'temp' beacuse if we use a=b it wil not give correct ans beacuse
                      // value of b is updated.
            count++;
        }
        System.out.println(b);
    }
}
// fibonacci number is addtion of privious two numbers
// 1st 2nd 3rd 4th 5th 6th 7th 8th 9th ..... nth
// 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 ,21 ...........
// 0+1=1 , 1+1=2 , 1+2=3 , 2+3=5 , 3+5=8 , 5+8=13 , 8+13=21, ....
