//2.Find maximum number between three numbers
import java.util.Scanner;
class MaximumNum2
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		int o;
		System.out.println("Enter a No1: ");
		System.out.println("Enter a No2: ");
		System.out.println("Enter a No3: ");
		n = sc.nextInt();
		m = sc.nextInt();
		o = sc.nextInt();		
		if(n>m){
			System.out.println(n +"is maximum");
		}else if(m>o){
			System.out.println(m +"is maximum");	
		}
		else if(o>n){
			System.out.println(o+"is maximum");
		}
	}	

}