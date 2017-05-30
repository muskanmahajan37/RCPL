/* Pattern 
@Author Vinit Shahdeo */
import java.util.Scanner;
class StringPattern{
	public static void main(String ... args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string - ");
		str=sc.next();
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length()-i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}