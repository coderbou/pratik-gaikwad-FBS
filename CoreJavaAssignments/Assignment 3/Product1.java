class Product
{
	int id ;
	String name;
	int quantity;
	double price;

	void setID(int a)
	{
		this.id= a;
	}
	void setName(String str)
	{
		this.name= str;
	}
	void setQuantity(int b)
	{
		this.quantity=b;
	}

	void setPrice(double y)
	{
		this.price= y;
	}
	int getID()
	{
		return this.id;
	}
	
	String getName()
	{
		return this.name;
	}
	int getQuantity()
	{
		return this.quantity;
	}
	
	double getPrice()
	{
		return this.price;
	}
	void display()
	{
		System.out.println(this.id+"  "+this.name+"  "+this.quantity+" "+this.price);

	}


}//class ends here 

class ProductClass
{
	public static void main(String[] args)
	{
			Product p1 = new Product();
			p1.setID(101);
			p1.setName("Employee1");
			p1.setQuantity(50);
			p1.setPrice(5000);
		
			
			System.out.println(p1.getID());
			System.out.println(p1.getName());
			System.out.println(p1.getQuantity());
			System.out.println(p1.getPrice());
			p1.display();
	}//main ends here
}//class ends here
		