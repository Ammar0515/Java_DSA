//Write a program to input from user and check number is divisable by 3 and 11 or not.
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		if(a%3==0 && a%11==0)
		{
			System.out.println(a+"Number is divisable by both 3 & 11");
		}else
		{
			System.out.println(a+"Number is not divisable by both 3 & 11");
		}
	}
}