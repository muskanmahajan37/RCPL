/*
Write a program that ask user to enter values in two integer a and b, 
now write a code to swap the values of a and b 
without taking any temporary variable.
*/
import java.util.Scanner;
class Swapping{
	public static void main(String ... args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("a = ");
		a=sc.nextInt();
		System.out.print("b = ");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("****Values after Swapping****");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	
	}

}