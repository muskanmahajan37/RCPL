import java.util.Scanner;
class Salesman
{
	int arr[][]=new int[4][4];
	int k;
	Salesman(int arr[][],int k)
	{
		this.k=k;
		for(int i=0;i<4;i++)
			this.arr[k][i]=arr[k][i];
	}
	int total()
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			sum+=arr[k][i];
		}
		return sum;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=1,l=0;
		int result=0,pt=0;
		int arr[][]=new int[4][4];

		for(int i=0;i<4;i++)
		{
			System.out.println("Enter products for Salesman "+(i+1));
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Salesman No.	Prod1	Prod2	Prod3	Prod4	Total");
		Salesman ob[]=new Salesman[4];
		for(int i=0;i<4;i++)
		{
			ob[i]=new Salesman(arr,l++);
		}
		for(int i=0;i<4;i++)
		{
			System.out.print(k++);
			
			for(int j=0;j<4;j++)
			{
				result=ob[i].total();	
				System.out.print("	"+arr[i][j]);
			}
			System.out.println("	"+result);
			result=0;
		}
		System.out.print("Prod Total");
		for(int i=0;i<4;i++)
		{
			pt=0;
			for(int j=0;j<4;j++)
			{
				pt+=arr[j][i];
			}
			System.out.print("	"+pt);
		}
		System.out.println();
	}
}