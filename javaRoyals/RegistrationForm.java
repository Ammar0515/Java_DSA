import java.util.Scanner;
public class RegistrationForm{

	public static void main(String args[])
	{
		Scanner scobj = new Scanner(System.in);
		scobj.nextLine();
		System.out.println("Enter Your Name: ");
		String str = scobj.nextLine();
	//	System.out.println("Name: "+str);

		
		System.out.println("Enter Your Age: ");
		byte age = scobj.nextByte();
	//	System.out.println("Age: "+age);

		System.out.println("Enter Your Gender: ");	
		char str1 = scobj.next().charAt(0);
	//	System.out.println("Gender: "+str1);
		
		scobj.nextLine();
		System.out.println("Enter Your Address: ");
		String str2 = scobj.nextLine();
	//	System.out.println("Address: "+str2);

		System.out.println("Do you Like Coding(true/False): ");
		boolean str3 = scobj.nextBoolean();
	//	System.out.println("Do You Like Coding(true/False): "+str3);
		
		System.out.println("Last Semester Marks: ");
		float marks = scobj.nextFloat();


		System.out.println("Name: "+str);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+str1);
		System.out.println("Address: "+str2);
		System.out.println("Do You Like Coding: "+str3);
		System.out.println("Last Semester Marks: "+marks);
	}
}