class Car
{
	String model ;
	int year;
	String brand;
	double price;

	void setModel(String a)
	{
		this.model= a;
	}
	void setBrand(String str)
	{
		this.brand= str;
	}
	void setPrice(double y)
	{
		this.price= y;
	}
	void setYear(int ye)
	{
		this.year=ye;
	}
	

	String getModel()
	{
		return this.model;
	}
	String getBrand()
	{
		return this.brand;
	}
	double getPrice()
	{
		 return this.price;
	}
	int getYear()
	{
		return this.year;
	}


		void display()
	{
		System.out.println(this.model+"  "+this.brand+"  "+this.price+" "+this.year);

	}


}//class ends here 

class CarClass
{
	public static void main(String[] args)
	{
			Car c1 = new Car();
			c1.setModel("nano");
			c1.setBrand("tata");
			c1.setPrice(500000);
			c1.setYear(2025);
		
			System.out.println(c1.getModel());
			System.out.println(c1.getBrand());
			System.out.println(c1.getPrice());
			System.out.println(c1.getYear());
			c1.display();
	}//main ends here
}//class ends here
		