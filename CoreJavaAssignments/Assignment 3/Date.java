class Date
{
	int day ,month ,year;
	String dow;

	void setDay(int a)
	{
		this.day=a;
	}

	void setMonth(int a)
	{
		this.month=a;
	}
	void setYear(int a)
	{
		this.year=a;
	}
	void setDow(String str)
	{
		this.dow=str;
	}

	int getDay()
	{
		return this.day;

	}

	int getMonth()
	{
		return this.month;
	}
	int getYear()
	{	
		return this.year;
	}
	String getDow()
	{
		return this.dow;
	}

	void display()
	{
			System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear()+"-"+this.getDow());
	}
}//class time end here

class Test
{
	public static void main(String []a)
  	
	{
		Date d1=new Date();
		Date d2=new Date();
		d1.setDay(3);
		d2.setDay(4);

		d1.setMonth(9);
		d1.setYear(2025);	
		d1.setDow("wed");
		
		if(d1.getDay()>d2.getDay())
		{
			System.out.println("d1.day is greather");
		}
		else
		{
			System.out.println("d2.day is greather");
		}
			

		d1.display();
	
  	}//main end

}//class source end