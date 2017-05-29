import java.util.Scanner;
class Employee{
	String name;
	double salary;
	int emp$id;
	void setDetails(String name, double salary, int emp$id)
	{
		this.name=name;
		this.salary=salary;
		this.emp$id=emp$id;
	}
	void getDetails()
	{
		System.out.println("Employee Details - ");
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("ID : "+emp$id);
	}
	public static void main(String ... args)
	{
		String name;
		int id;
		double salary;
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees");
		n=sc.nextInt();
		Employee e[]=new Employee[n];
		System.out.println("EMPLOYEE DETAILS");
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
		System.out.println("Enter Name -");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Salary:");
		salary=sc.nextDouble();
		System.out.println("Enter ID:");
		id=sc.nextInt();
		e[i].setDetails(name,salary,id);
	}
	for(int i=0;i<e.length;i++)
	{
		System.out.println("Employee Details");

		System.out.println("Name - "+e[i].name);
		System.out.println("Salary - "+e[i].salary);
		System.out.println("ID - "+e[i].emp$id);
		System.out.println();
	}

	}
}