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

        Product()
          {
             this.id=101;
             this.name="Employee";
             this.quantity=50;
             this.price=5000;
      
            System.out.println("Default Construtor");
          }

        Product(int a, String str,int b, double c)
          {
            this.id=a;
            this.name=str;
            this.quantity=b;
            this.price=c;
            System.out.println("parametrized Construtor");

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
			p1.display();

			Product p2 = new Product(102,"Employee2",40,4000);
			p2.display();


	}//main ends here
}//class ends here
		