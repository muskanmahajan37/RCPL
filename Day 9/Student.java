import java.util.Scanner;
class Student{
	public static void main(String[] args) {
		String student [][]={
								{"15BIT0335","Vinit Shahdeo"},
								{"15BIT0257","Ratnesh Kanungo"},
								{"15BIT0259","Archit Roy"},
								{"15BIT0319","Aditi Ghosh"},
								{"15BIT0051","Ananya Chaudhary"}
							};
	System.out.print("Enter Roll number to search - ");
	Scanner sc=new Scanner(System.in);
	String roll=sc.next();
	int flag=0;
	for(int i=0;i<5;i++)
	{
		if(student[i][0].equals(roll))
		{
			System.out.println("NAME - "+student[i][1]);
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("Wrong rollnumber");
	}
	}
}