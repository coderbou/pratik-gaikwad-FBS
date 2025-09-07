class Book
{
	int bookno;
	String bookname ;
	double price;
	String author;
	String publisher;

	void setBookno(int a)
	{
		this.bookno= a;
	}
	void setBookname(String b)
	{
		this.bookname= b;
	}
	void setAuthor(String c)
	{
		this.author= c;
	}
	void setPublisher(String d)
	{
		this.publisher= d;
	}
	void setPrice(double e)
	{
		this.price=e;
	}
	
	
		

	int getBookno()
	{
		return this.bookno;
	}
	String getBookname()
	{
		return this.bookname;
	}
	String getAuthor()
	{
		 return this.author;
	}
	String getPublisher()
	{
		return this.publisher;
	}
	double getPrice()
	{
		return this.price;
	}


		void display()
	{
		System.out.println(this.bookno+"  "+this.bookname+"  "+this.price+" "+this.publisher+" "+this.author);

	}


}//class ends here 

class BookClass
{
	public static void main(String[] args)
	{
			Book b1 = new Book();
			b1.setBookno(101);
			b1.setBookname("C Programming");
			b1.setPrice(500);
			b1.setPublisher("Nirali Prakashan");
			b1.setAuthor("XYZ");
		
			System.out.println(b1.getBookno());
			System.out.println(b1.getBookname());
			System.out.println(b1.getPrice());
			System.out.println(b1.getPublisher());
			System.out.println(b1.getAuthor());
			b1.display();
	}//main ends here
}//class ends here
		