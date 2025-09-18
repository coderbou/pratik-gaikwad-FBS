import java.util.Scanner;
class Car
{
	int model;
	int year;
	double price;
	String brand;
	
	void setModel(int model)
	{
		this.model=model;
	}
	
	void setYear(int year)
	{
		this.year=year;
	}
	
	void setPrice(double price)
	{
		this.price=price;	
	}
	
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	int getModel()
	{
		return this.model;
	}
	int getYear()
	{
		return this.year;
	}
	double getPrice()
	{
		return this.price;
	}
	String getBrand()
	{
		return this.brand;
	}

	void display()
	{
	
		System.out.println("Model:"+this.model);
		System.out.println("Year:"+this.year);
		System.out.println("Price:"+this.price);
		System.out.println("Brand:"+this.brand);
	}
	Car()
	{
		this.model=345;	
		this.year=2024;
		this.price=1500000.20;
		this.brand="Hundai";
		System.out.println("Default Constructor:");
	}
	Car(int m,int y,double p, String b)
	{
		this.model=m;	
		this.year=y;
		this.price=p;
		this.brand=b;
		System.out.println("Parameterized Constructor:");
	}


}
class Test
{
	public static void main(String []a)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Model");
		int m=sc.nextInt();

		System.out.println("Enter a year");
		int y=sc.nextInt();

		System.out.println("Enter a price");
		double p=sc.nextDouble();	
		sc.nextLine();

		System.out.println("Enter a brand");
		String i=sc.nextLine();
	
		Car d1=new Car();
		d1.display();
		Car c2=new Car(m,y,p,i);
		c2.display();
	}
}	
