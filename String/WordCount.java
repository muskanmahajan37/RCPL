/* Counting number of words in a givem string */
import java.util.Scanner;
class WordCount{
	public static void main(String ... args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		int l=str.trim().split(" ").length;
		System.out.println(l);
	}
}