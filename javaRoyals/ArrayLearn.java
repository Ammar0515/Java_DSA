import java.util.Scanner;
class ArrayLearn{

	public static void main(String args[])
	{
		Scanner scobj = new Scanner(System.in);

		int arr[] = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = scobj.nextInt();
		}
		System.out.println("Array is:- ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
