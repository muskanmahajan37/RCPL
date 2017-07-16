class Electricity{
	String name;
	int units;
	public void calcPrice(int units)
	{
		float price;
		if(units<=100)
		{
			price=units*40/100;
		}
		else if(100<units&&units<=300)
		{
			price=(100*40+(units-100)*50)/100;
		}
		else 
		{
			price=(100*40+200*50+(units-300)*60)/100;
		}
		if(price>250)
			{
				price=price+price*15/100;
			}
			System.out.println("PRICE = "+price);
	}
	public static void main(String[] args) {
		Electricity e=new Electricity();
		e.calcPrice(2000);
	}
}