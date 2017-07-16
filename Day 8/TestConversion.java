import java.util.Scanner;
class Conversion{
public static float  dollarToRupees(float amountInDollar)
	{
		float r=amountInDollar*(float)64.48;
		return r;
	}
public static float  rupeesToDollar(float amountInRupees)
{
	float d=amountInRupees*(float)0.016;
	return d;
}
public static int  meterToKilometer(int distanceInMeters)
{
    int km=distanceInMeters/1000;
    return km;
}
public static int  kilometerToMeter(int distancKilometers)
{
	int m=distancKilometers*1000;
	return m;
}
public static float celciusToFarenhiet(float tempInCelcius)
{
	float f= (tempInCelcius * 9/5) + 32 ;
	return f;
}
public static float farenhietToCelcius(float tempInFarenhiet)
{
	float f= (tempInFarenhiet-32) * 5/9;
	return f;
}

}
class TestConversion
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the options");
		System.out.println("1 - Dollar to Rupees");
		System.out.println("2 - Rupees to Dollar");
		System.out.println("3 - Metre to KM");
		System.out.println("4 - KM to Metre");
		System.out.println("5 - C to F");
		System.out.println("6 - F to C");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter dollar - ");
			float x=sc.nextFloat();
			float y= Conversion.dollarToRupees(x);
			System.out.println("Rupees = "+y);
			break;
			case 2:
			System.out.println("Enter rupees - ");
			float a=sc.nextFloat();
			float b= Conversion.rupeesToDollar(a);
			System.out.println("Dollar = "+b);
			break;
			case 3:
			System.out.println("Enter metre - ");
			int c=sc.nextInt();
			int d= Conversion.meterToKilometer(c);
			System.out.println("KM = "+d);
			break;
			case 4:
			System.out.println("Enter KM - ");
			int e=sc.nextInt();
			int f= Conversion.kilometerToMeter(e);
			System.out.println("metre = "+f);
			break;
			case 5:
			System.out.println("Enter Celcius - ");
			float g=sc.nextFloat();
			float h= Conversion.celciusToFarenhiet(g);
			System.out.println("Farenhiet = "+h);
			break;
			case 6:
			System.out.println("Enter Farenhiet - ");
			float i=sc.nextFloat();
			float j= Conversion.farenhietToCelcius(i);
			System.out.println("Celcius = "+j);
			break;
		}
	}
}