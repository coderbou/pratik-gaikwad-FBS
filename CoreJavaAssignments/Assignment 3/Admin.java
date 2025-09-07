class Admin
{
	int id ;
	String name;
	double salary;
	double allowance;

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
	void setAllowance(double allow)
	{
		this.allowance=allow;
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
	double getAllowance()
	{
		return this.allowance;
	}
	
	void display()
	{
		System.out.println(this.id+"  "+this.name+"  "+this.salary+" "+this.allowance);

	}


}//class ends here 

class AdminClass
{
	public static void main(String[] args)
	{
			Admin a1 = new Admin();
			a1.setID(101);
			a1.setName("XYZ");
			a1.setSal(50000);
			a1.setAllowance(1000);
			
			System.out.println(a1.getID());
			System.out.println(a1.getName());
			System.out.println(a1.getSalary());
			System.out.println(a1.getAllowance());
			a1.display();
	}//main ends here
}//class ends here
		