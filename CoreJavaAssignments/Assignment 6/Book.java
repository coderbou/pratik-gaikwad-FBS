import java.util.Scanner;
class Book
{
	String isbn;
	String title;
	String author;
	String publisher;
	double price;
	
	void setIsbn(String s)
	{
		this.isbn=s;
	}
	void setTitle(String  t)
	{
		this.title=t;
	}
	void setAuthor (String a)
	{
		this.author=a;
	}
	void setPublisher (String pu)
	{
		this.publisher=pu;
	}
	void setPrice(double p)
	{
		this.price=p;
	}
	String getIsbn()
	{ 	
		return isbn;
	}
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	String getPublisher()
	{
		return publisher;
	}
	double getPrice()
	{
		return price;
	}
	void display()
	{
		System.out.println("Isbn:"+this.isbn);
		System.out.println("Title:"+this.title);
		System.out.println("Author:"+this.author);
		System.out.println("Publisher:"+this.publisher);
		System.out.println("Price:"+this.price);
	}

	Book()
	{
		System.out.println("Default constructor:");

		this.isbn="2";
		this.title="Breaking the Mould";
		this.author="Raghuram G.Rajan and Rohit Lamba";
		this.publisher="Penguin Random House India";
		this.price=399.0;
	}
	Book(String i, String t,String auth, String pub, double pri)
	{
		System.out.println("parameters constructor:");

		this.isbn=i;
		this.title=t;
		this.author=auth;
		this.publisher=pub;
		this.price=pri;

	}
}
class Test
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a isbn");
		String i=sc.nextLine();

		System.out.println("Enter a title");
		String t=sc.nextLine();

		System.out.println("Enter a author");
		String auth=sc.nextLine();

		System.out.println("Enter a publisher");
		String pub=sc.nextLine();

		System.out.println("Enter a price");
		double pri=sc.nextDouble();


		Book b1=new Book();
		b1.display();
		Book b2=new Book(i,t,auth,pub,pri);
		b2.display();
	}
}
	