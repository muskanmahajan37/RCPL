class Test{
	int num;
	Test(int num)
	{
		this.num=num;
	}
	public int getReverse()
	{
		int sum=0;
		int d;
		while(num>0)
		{
			d=num%10;
			sum=sum*10+d;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Test t=new Test(234);
		int x=t.getReverse();
		System.out.println(x);
	}
}