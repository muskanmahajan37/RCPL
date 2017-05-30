/* Remove all occurences of a given character */
import java.util.Scanner;
class RemoveChar{
	public static void main(String ... args)
	{
		String str;
		char []s;
		int uniquecount=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String - ");
		str=sc.nextLine();
		s=str.toCharArray();
		char []s1=new char[s.length];
		System.out.print("Enter Charcter to be removed - ");
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=ch)
			
			s1[uniquecount++]=s[i];

			else
				continue;
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s1[i]);
		}
	}
}