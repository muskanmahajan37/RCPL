import java.util.Scanner;
class Product{
	int productId;
	String productName,productType;
	float productPrice;
	Product(int productId,String productName,String productType,float productPrice)
	{
		this.productId=productId;
		this.productName=productName;
		this.productType=productType;
		this.productPrice=productPrice;
	}
}
class Shop{

Product[] p = new Product[] { new Product(1001,"Cadburry","Chocolate",20), 
new Product(1002,"Pepsi","Beverages",40),new Product(1009,"Milk","Milk",210)};
		

	public void viewAllProducts() 
	{
		System.out.println("******PRODUCT DETAILS*******");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].productId+" : "+p[i].productName);
		}
	}
	public void viewProductDetail( int  id )
	{
		for(int i=0;i<p.length;i++)
			{
				if(p[i].productId==id)
				{
					System.out.println("Product Name - "+p[i].productName);
					System.out.println("Product Type - "+p[i].productType);
					System.out.println("Product Price - "+p[i].productPrice);
				}
			}
	}
	public static void main(String[] args) {
		Shop s=new Shop();
		Scanner sc=new Scanner(System.in);
		System.out.println("********SHOP MENU********");
		System.out.println("Press 1 to VIEW ALL Products\nPress 2 for SEARH Prodcuts \n 3 for EXIT");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			s.viewAllProducts();
			break;
			case 2:
			System.out.println("Enter id");
			int id=sc.nextInt();
			s.viewProductDetail(id);
			break;
			case 3:
				System.exit(0);
				break;

		}
		
	}
}