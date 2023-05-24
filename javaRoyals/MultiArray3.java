import java.util.Scanner;
class MultiArray3
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][3];
		System.out.println("Enter Elements of Array:- ");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of Array:-");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}