import java.util.Scanner;  
class Factorial{
	
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number =");
		n=sc.nextInt();
		int f=1;
		int i=1;
		while(i<=n)
		{
			f=f*i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+f);
	}
}