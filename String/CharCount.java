/* Counting Number of particular characters in a given string */
import java.util.Scanner;
class CharCount{
	public static void main(String ... args)
	{
		int count=0;
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String - ");
		str=sc.nextLine();
		str=str.toLowerCase();
		System.out.print("Enter character to be searched - ");
		ch=sc.next().charAt(0);
		char []s=str.toCharArray();
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}