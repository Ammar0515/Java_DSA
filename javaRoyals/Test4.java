/*
count total no of notes in given amount

5521

500 - 5500/500 = 11 (21)
200 -
100 -
50 - 
20 - 1
10 -
5 - 
1 -1

total - 13
*/
import java.util.Scanner;
class Test4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n2000, n500, n200, n100, n50, n20, n10, n5, n2, n1;
		System.out.println("Enter Amount:- ");
		int amt = sc.nextInt();
		if(amt>=2000)
		{
			n2000 = amt/2000;
			amt = amt -(n2000*2000);
			System.out.println("Number of 2000 Notes: "+n2000);
		}
		if(amt>=500)
		{
			n500 = amt/500;
			amt = amt -(n500*500);
			System.out.println("Number of 500 Notes: "+n500);
		}
		if(amt>=200)
		{
			n200 = amt/200;
			amt = amt -(n200*200);
			System.out.println("Number of 200 Notes: "+n200);
		}
		if(amt>=100)
		{
			n100 = amt/100;
			amt = amt -(n100*100);
			System.out.println("Number of 100 Notes: "+n100);
		}
		if(amt>=50)
		{
			n50 = amt/50;
			amt = amt -(n50*50);
			System.out.println("Number of 50 Notes: "+n50);
		}
		if(amt>=20)
		{
			n20 = amt/20;
			amt = amt -(n20*20);
			System.out.println("Number of 20 Notes: "+n20);
		}
		if(amt>=10)
		{
			n10 = amt/10;
			amt = amt -(n10*10);
			System.out.println("Number of 10 Notes: "+n10);
		}
		if(amt>=5)
		{
			n5 = amt/5;
			amt = amt -(n5*5);
			System.out.println("Number of 5 Notes: "+5);
		}
		if(amt>=2)
		{
			n2 = amt/2;
			amt = amt -(n2*2);
			System.out.println("Number of 2 Notes: "+n2);
		}
		if(amt>=1)
		{
			n1 = amt/1;
			amt = amt -(n1*1);
			System.out.println("Number of 1 Notes: "+n1);
		}
	}
}