import java.util.Scanner;
public class Oddfloop
{
	public static void main(String args[])
	{
		int i;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number for the range:- ");
		int n1 = scan.nextInt();
		
		System.out.print("Enter the Second number for the range:- ");
		int n2 = scan.nextInt();
	
		for(i=n1; i<=n2; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}