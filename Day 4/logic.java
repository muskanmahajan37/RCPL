import logicgate.And;
import logicgate.Or;
import logicgate.Not;
import java.util.Scanner;
class logic{
public static void main(String []args)
{
       And ar=new And();
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter number one ");
	   int i=s.nextInt();
	   System.out.println("Enter number two ");
	   int j=s.nextInt();
	   int x=ar.and(i,j);
	   System.out.println("AND :"+x);
	   Or o=new Or();
	   int y=o.or(i,j);
	   	System.out.println("OR : "+y);
		Not n=new Not();
		int z=n.not(i);
		System.out.println("NOT :"+z);
		
        		
}
}