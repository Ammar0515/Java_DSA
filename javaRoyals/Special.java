//5. check character is alphabet , number or special character ?
import java.util.Scanner;
class Special
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a Character: ");
		char str = sc.next().charAt(0);
		if(str>='a' && str<='z' || str>='A' && str<='Z' )
		{
			System.out.println(str +"is Alphabet ");
		}else if(str>= '0' && str<='9')
		{
			System.out.println(str+"is Number");
		}else
		{
			System.out.println(str+"is special character");
		}
	}
}