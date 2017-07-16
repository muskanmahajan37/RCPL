import java.util.Scanner;
class Admission{
	String name;
	int mathMarks, phyMarks,chemMarks;
	
	public void check()
	{
		int total=phyMarks+mathMarks+chemMarks;
		int total2=mathMarks+phyMarks;
		if(mathMarks>=60&&phyMarks>=50&&chemMarks>=40&&(total>=200||total2>=150))
			System.out.println("ELIGIBLE FOR ADMISSION");
		else
		{
			System.out.println("NOT ELIGIBLE FOR ADMISSION");
		}
	}
	public static void main(String[] args) {
		Admission a=new Admission();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name -");
		a.name=sc.nextLine();
		System.out.println("Enter Phy Marks -");
		a.phyMarks=sc.nextInt();
		System.out.println("Enter Math Marks -");
		a.mathMarks=sc.nextInt();
		System.out.println("Enter Chem Marks -");
		a.chemMarks=sc.nextInt();
		a.check();
	}
}