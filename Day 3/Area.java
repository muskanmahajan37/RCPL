class Area{
	public static final float PI = (float)3.14;
	public void areaOfCircle(int r)
	{
		float a=PI*r*r;
		System.out.println("AREA OF CIRCLE = "+a);
	}
	public void areaOfCylinder(int r,int h)
	{
		float a=2*PI*r*r+2*PI*r*h;
		System.out.println("AREA OF CYLINDER = "+a);
	}
	public static void main(String[] args) {
		Area test=new Area();
		test.areaOfCircle(7);
		test.areaOfCylinder(7,10);
	}
}