import java.util.Scanner;
class GreatNum{
	public static void main(String[] args) {
		int a,b,c,big;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		big=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Greatest Number is "+big);
	}
}