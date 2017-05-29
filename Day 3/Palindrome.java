/* 
A palindrome is a number that reads the same forwards and backwards, like 12321. 
Write a program that tests input integers for the palindrome property. 
*/
import java.util.Scanner;
class Palindrome{
	public static void main(String [] args)
	{
		int num,check;
		int d,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number - ");
		num=sc.nextInt();
		check=num;
		while(check>0)
		{
			d=check%10;
			s=d+s*10;
			check=check/10;
		}
		if(num==s)
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}
}