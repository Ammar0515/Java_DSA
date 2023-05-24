import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int num = 1; num <= 10; num++) {
        // System.out.println(num);

        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num + " ");
        }
    }

    /*
     * >> for loop syntex:
     * 
     * for(initialistion; condition; increment/decrement){
     * // body
     * }
     * /*
     * --->> While loop syntex <<---
     * 
     * initialisation
     * while (condition){
     * //body
     * increment/decrement
     * }
     * 
     * // when you don't know how much time the loop is going to run
     * // you can use this loop.
     */

    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * 
     * // int num = 1;
     * // while (num <= 10) {
     * // System.out.println(num);
     * // num++;
     * // }
     * 
     * int n = sc.nextInt();
     * num = 1;
     * while (num <= n) {
     * System.out.println(num + " ");
     * num++;
     * }
     * }
     */

    /*
     * --->> do while loop syntex <<---
     * 
     * initialisation
     * do{
     * body
     * increment/decrement
     * }while(condition);
     * 
     * 
     * // in do while loop the program will atleast run once
     * // doesn't metters condition is match or not after running
     * // one time then it will check the condition.
     */

    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * 
     * // int num = 1;
     * // do {
     * // System.out.println(num);
     * // num++;
     * // } while (num <= 10);
     * 
     * int n = sc.nextInt();
     * num = 1;
     * do {
     * System.out.println(num + " ");
     * num++;
     * } while (num <= n);
     * 
     * }
     */
}
