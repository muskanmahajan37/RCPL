class Test{
	
	private Test()
	{
		System.out.println("Hello I'm private constructor");
	}
	static Test getObject()
	{
		return new Test();
	}
	
}

class Demo{

	
	public static void main(String ... args)
	{
		Test obj=Test.getObject();
	}
}