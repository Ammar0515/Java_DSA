import java.util.Scanner;
class Opraters{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
/*
			System.out.println("Enter Two Number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			System.out.println("Sum of two Number is"+(a+b));
			System.out.println("Sum of two Number is"+(a-b));
			System.out.println("Sum of two Number is"+ a*b);
			System.out.println("Sum of two Number is"+ a/b);
			System.out.println("Sum of two Number is"+ a%b);
			
			a=6;
			System.out.println(a++);
			System.out.println(++a);
			System.out.println(--a);
			System.out.println(a--);
*/
			a=6;
			b=5;
			System.out.println ("Ans= "+(a++ + a++ + b-- + --b + --a + a++));

	}
}
