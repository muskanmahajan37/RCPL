/* Reverse a string without using revers() method */
import java.util.Scanner;
class StringReverse{
	public static void main(String ... args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string - ");
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}