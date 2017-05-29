/*
Write a program to take input from user in a integer 
and print a table of that value , like
Enter Value : 3
3 X 1 = 3
3 X 2 = 6
.....
*/
import java.util.Scanner;
class Table{
	public static void main(String ... args)
	{
		int n,x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n = ");
		n=sc.nextInt();
		System.out.println("Table of "+n+" - ");
		for(int i=1;i<=10;i++)
		{
			x=n*i;
			System.out.println(n+" * "+i+" = "+x);
		}
	}
}