import java.util.Scanner;
class Matrix{
	public static void main(String ... args)
	{
	int rows,cols;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows");
	rows=sc.nextInt();
	System.out.println("Enter number of columns");
	cols=sc.nextInt();
	int a[][]=new int[rows][cols];
	int b[][]=new int[rows][cols];
	int c[][]=new int[rows][cols];
	System.out.println("Enter elements for Matrix A");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("Enter element at "+i+"th row and "+j+"th column - ");
				a[i][j]=sc.nextInt();
			}
		}
	System.out.println("Enter elements for Matrix B");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("Enter element at "+i+"th row and "+j+"th column - ");
				b[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The sum of matrix A and B is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}