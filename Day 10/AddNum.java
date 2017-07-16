class AddNum{
	public int add(int x,int y)
	{
		return x+y;
	}
	public int add(int x,int y,int z)
	{
		return x+y+z;
	}
	public int add(int x,int y,int z,int u)
	{
		return x+y+z+u;
	}
	public static void main(String[] args) {
		AddNum obj=new AddNum();
		int a=obj.add(2,3);
		int b=obj.add(4,5,6);
		int c=obj.add(9,1,13,5);
		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
	}
}