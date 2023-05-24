//3. take input from user month number and print days of that month
// 1 - 31 days
// 2 - 28/29
import java.util.Scanner;
class Test3
{
	public static void main(String args[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number :- ");
		i = sc.nextInt();
		if(i==1)
		{
			System.out.println("31 Days");
		}
		else if(i==2)
		{
			System.out.println("28/29 Days");
		}
		else if(i==3)
		{
			System.out.println("31 Days");
		}
		else if(i==4)
		{
			System.out.println("30 Days");
		}
		else if(i==5)
		{
			System.out.println("31 Days");
		}
		else if(i==6)
		{
			System.out.println("30 Days");
		}
		else if(i==7)
		{
			System.out.println("31 Days");
		}
		else if(i==8)
		{
			System.out.println("31 Days");
		}
		else if(i==9)
		{
			System.out.println("30 Days");
		}
		else if(i==10)
		{
			System.out.println("31 Days");
		}
		else if(i==11)
		{
			System.out.println("30 Days");
		}
		else if(i==12)
		{
			System.out.println("31 Days");
		}
		else 
		{
			System.out.println("Incorrect Month Number!!!");
		}
	}
}