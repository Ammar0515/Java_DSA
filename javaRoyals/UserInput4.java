import java.util.Scanner;
public class UserInput4{

	public static void main(String args[])
	{
		//class name objname = new class name;
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		double age =scobj.nextDouble();
		System.out.println("Your age is "+ age);
		
		scobj.nextLine();
		System.out.println("Enter a String: ");
		String str1 = scobj.nextLine();
		System.out.println("Your string is "+  str1);
	}
}