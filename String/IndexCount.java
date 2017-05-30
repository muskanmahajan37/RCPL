/* 
WAP to count index of all occurences of 'b' after 'a'
@Author Vinit Shahdeo
*/
import java.util.Scanner;
class IndexCount{
	public static void main(String ... args)
	{
		String str;
		int count=0;
		int a$index,b$index;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string - ");
		str=sc.nextLine();
		a$index=str.indexOf('a');
		while(a$index!=-1)
		{
			b$index=str.indexOf('b',a$index+1);
			System.out.println(b$index);
			a$index=str.indexOf('b',b$index+1);
		}
	}
}