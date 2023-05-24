
import java.util.Scanner;
class MaximumNum
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		System.out.println("Enter a No1: ");
		System.out.println("Enter a No2: ");
		n = sc.nextInt();
		m = sc.nextInt();
		if(n>m){
			System.out.println(n+"is maximum");
		}else{
			System.out.println(m+"is maximum");
		}
	}	

}