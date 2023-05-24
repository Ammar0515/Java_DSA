importjava.util.Scanner;
class ConditionalStat
{
	public static void main(String args[]);
	{
		Scanner sc = new Scaanner(System.in);
		int n;
		System.out.println("Enter a NO: ");
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println(n + "is Positive");
		}else
		{
			System.out.println(n +"is Nagavtive");
		}
	}else if(n==0){
		System.out.println("No is Zero");
	}else{
		System.out.println("");
	}

}