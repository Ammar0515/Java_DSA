// - single line comment

/* 

Operators

1. Arithmetic operators

+
-
*
/
%

2. Unary operator

++
--

3. Relational operator

<
>
<=
>=
==
!=

4. Logical Operators

&&
||
!

&&

A	B	A&&B

F	F	F
F	T	F
T	F	F
T	T	T

||

A	B	A||B

F	F	F
F	T	T
T	F	T
T	T	T



5. Bitwise Operator

& 
|
^
<<- left shift
>>- right shift 

^

A	B	A||B

F	F	F
F	T	T
T	F	T
T	T	F
*/

import java.util.Scanner;
class Operators
{

	public static void main(String  []args)
	{

		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();

		System.out.println(" Sum of two number is " + (a+b));
		System.out.println(" Sum of two number is " + (a-b));
		System.out.println(" Sum of two number is " + a*b);
		System.out.println(" Sum of two number is " + a/b);
		System.out.println(" Sum of two number is " + a%b);

		*/
		
		//int a=6,b=5,c=3;
		//System.out.println(a++); // print - 6 a=7
		//System.out.println(++a);//a=8 , print - 8
		//System.out.println(--a); // a=7 , print 7
		//System.out.println(--a);// print 7 , a=6

		//System.out.println(a++  +  a++  +  b--  +  --b  +  --a  +  a++);	
		

		//System.out.println(--a + --b + --a + b-- + a++ - b++ - --b + a++);
		//System.out.println("a= " + a);
		//System.out.println("b= " + b);
		
		//System.out.println(a>b  || b>c);
		//System.out.println(!(a>b));
		//System.out.println(a==b);
		//System.out.println(a!=b);

		int a=7;//4 -  0000 0111----> 0001 1100 
		int b=5;// 5 -  0000 0101----> 0000 0001
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(b>>3);

		

		
		
	}


}














