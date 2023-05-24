// - single line comment

/* --> Multiline comment

Data Types
Boolen 	-nextBolean()
byte		-nextByte()
short	-nextShort()
int		-nextInt()
long		-nextLong()
double	-nextDouble()
float    -nextFloat()

char - next()
*/


import java.util.Scanner;
public class UserInput{

	public static void main(String args[])
	{
		//class name objname = new class name;
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age =scobj.nextInt();
		System.out.println("Your age is "+ age);
		
		System.out.println("Enter a String: ");
		char str = scobj.next().charAt(0);
		System.out.println("Your string is: "+str);
		
		scobj.nextLine();
		System.out.println("Enter a String: ");
		String str1 = scobj.nextLine();
		System.out.println("Your string is "+  str1);
	}
}