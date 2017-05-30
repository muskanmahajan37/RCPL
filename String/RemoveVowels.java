/*
WAP to remove vowels from agiven string
@Author Vinit Shahdeo
*/
import java.util.Scanner;
class RemoveVowels{
	public static void main(String ... args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		String str1="";
		System.out.print("Enter string- ");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				continue;
				default:
					str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}