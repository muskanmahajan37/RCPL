/* Counting frequency of a character in a given string */
import java.util.Scanner;
class CharFrequency{
	public static void main(String ... args)
	{
		String str;
		char ch;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string - ");
		str=sc.nextLine();
		System.out.print("Enter character - ");
		ch=sc.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println("Frequency of "+ch+" = "+count);
	}
}