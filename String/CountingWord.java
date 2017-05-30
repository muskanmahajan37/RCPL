/* 
Count number of occurences of "AND" or "THE" in a given string
@Author Vinit Shahdeo
*/
import java.util.Scanner;
class CountingWord{
	public static void main(String ... args)
	{
		int and$count=0,the$count=0;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		str=sc.nextLine();
		int index=str.indexOf("and");
		
		while(index!=-1)
		{
			and$count++;
			index=str.indexOf("and",index+"and".length());
		}
		index=str.lastIndexOf("the");
		while(index!=-1)
		{
			the$count++;
			index=str.lastIndexOf("the",index-"the".length());
		}
		System.out.println("THE - "+the$count);
		System.out.println("AND - "+and$count);
	}
}