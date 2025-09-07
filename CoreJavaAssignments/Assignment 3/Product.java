class Product
{
	int id;
	String name;
	int quantity;
	double price;

	void setId(int id)
	{
		this.id=id;
	}

	void setName(String name)
	{
		this.name=name;
	}
	
	void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	void setPrice(double price)
	{
		this.price=price;
	}

	int getId()
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
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("quantity:"+this.quantity);
		System.out.println("price:"+this.price);

	}



}//class product

class Test
{
	public static void main(String [] a)
	{
		Product p=new Product();
		p.setId(101);
		p.setName("Laptop");
		p.setQuantity(10);
		p.setPrice(50000.00);
		p.display();
	}//main end here
}//class test end here 
