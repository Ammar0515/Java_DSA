// input from user (marks)
// marks>=90 print grede(A)
// marks<90 && marks>=80 print grade(b)// marks<80 and >=70 print grade( c)
//marks<70 marks>=60 print grade(D) 
// <60 >=50 -E <50 - fail
import java.util.Scanner;
class Test2
{
	public static void main(String args[])
	{
		float total = 0;
		float avg; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Subject 1 :  ");
		System.out.println("Enter marks of Subject 2 :  ");
		System.out.println("Enter marks of Subject 3 :  ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		total = s1 + s2 + s3;
		avg = total/3;
		System.out.println("Student Grade is :- ");
		if(avg>=90)
		{
			System.out.println("A");
		}
		else if(avg<90 && avg>=80)
		{
			System.out.println("B");
		}
		else if(avg<80 && avg>=70)
		{
			System.out.println("C");
		}
		else if(avg<70 && avg>=60)
		{
			System.out.println("D");
		}
		else if(avg<60 && avg>=50)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("FAIL!!!");
		}
	}
}

