class Example{
	public static void main(String ... args)
	{
		String s="Hello";
		String s1= new String("Hello");
		String s2="Hello";
		System.out.println("****Comparing s and s1****");
		if(s==s1)
			System.out.println("Strings are equals");
		else
		{
			System.out.println("Strings are not equal");
		}
		System.out.println("****Comparing s and s2****");
		if(s==s2)
			System.out.println("Strings are equals");
		else
		{
			System.out.println("Strings are not equal");
		}
	}
}