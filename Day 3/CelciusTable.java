class CelciusTable
{
	public static void main(String[] args) {
		System.out.println("Celcius to Farenheit");
		for(int i=0;i<100;i++)
		{
			float f= (i * 9/5) + 32 ;
			System.out.println(i + " CELCIUS = "+f+ " FARENHEIT");
		}
	}
}