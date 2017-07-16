class DiagonalMatrix
{
 public static void main(String arg[])
 {
  int a[][]= new int[3][3];
  int i,j,k=0;
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    a[i][j]=k;
     k++;
   }
  }
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
    {
     System.out.print("  " +a[i][j]);
         
     }
     System.out.println("\n");
    }
System.out.println("digonal elments are :");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
    {
     if(i!=j)
     {System.out.println(" ");}
     else if(i==j){
System.out.println(a[i][j]);     
     }
	
    }
 }
}  
}