//3. check number is even or odd?
import java.util.Scanner;
class OddEven
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i;	
		System.out.println("Enter a Number: ");
		i = sc.nextInt();
		if(i%2==0){
			System.out.println("Number is Even");
		}else{
			System.out.println("Number is Odd");
		}
	
	}

}