class HR
{
	int id ;
	String name;
	double salary;
	double Commission;

	void setID(int a)
	{
		this.id= a;
	}
	void setName(String str)
	{
		this.name= str;
	}
	void setSal(double y)
	{
		this.salary= y;
	}
	void setCommission(double Commi)
	{
		this.Commission=Commi;
	}
	int getID()
	{
		return this.id;
	}
	
	String getName()
	{
		return this.name;
	}
	
	double getSalary()
	{
		return this.salary;
	}
	double getCommission()
	{
		return this.Commission;
	}
	
	void display()
	{
		System.out.println(this.id+"  "+this.name+"  "+this.salary+" "+this.Commission);

	}


}//class ends here 

class HRClass
{
	public static void main(String[] args)
	{
			HR h1 = new HR();
			h1.setID(101);
			h1.setName("XYZ");
			h1.setSal(50000);
			h1.setCommission(1000);
			
			System.out.println(h1.getID());
			System.out.println(h1.getName());
			System.out.println(h1.getSalary());
			System.out.println(h1.getCommission());
			h1.display();
	}//main ends here
}//class ends here
		