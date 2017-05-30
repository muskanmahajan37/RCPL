/* Count number of vowels in a given string */
import java.util.Scanner;
class VowelCount{
	public static void main(String ... args)
	{
		String str;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String - ");
		str=sc.nextLine();
		str=str.trim();
		System.out.println(str.length());
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Number of Vowels = "+count);
	}
}