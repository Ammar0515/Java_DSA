//4. check alphabet is vowel or consonant ?
import java.util.Scanner;
class Vowel
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter an Alphabet: ");
		char str = sc.next().charAt(0);
		if(str=='a'||str=='A'||str=='e'||str=='E'||str=='i'||str=='I'||str=='o'||str=='O'||str=='u'||str=='U'){
			System.out.println(str+ " Alphabet is vowel");
		}else{
			System.out.println(str+ " Alphabet is Consonant");
		}
	}
}