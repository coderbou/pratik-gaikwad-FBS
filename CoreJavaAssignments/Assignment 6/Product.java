import java.util.Scanner;
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
	Product()
	{
                System.out.println("Default Constructor");
		this.id=109;
		this.name="Mobile phone";
		this.quantity=10;
		this.price=80000.00;
	}
	Product(int i, String n, int q, double p)
	{
                System.out.println("Parameterized Constructor");

		this.id=i;
		this.name=n;
		this.quantity=q;
		this.price=p;
	}



}//class product

class Test
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a id:");
		int i=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter a Product name:");
		String n=sc.nextLine();

		System.out.println("Enter a quantity:");
		int q=sc.nextInt();

		System.out.println("Enter a price:");
		double pr=sc.nextDouble();

		Product p=new Product();
		p.display();
		Product p1=new Product(i,n,q,pr);
		p1.display();
	}//main end here
}//class test end here 
