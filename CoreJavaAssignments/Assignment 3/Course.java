class Course
{
	int ID ;
	String name;
	double fees;

	void setID(int a)
	{
		this.ID= a;
	}
	void setName(String str)
	{
		this.name= str;
	}
	void setFees(int y)
	{
		this.fees= y;
	}
	int getID()
	{
		return this.ID;
	}
	
	String getName()
	{
		return this.name;
	}
	
	double getFees()
	{
		return this.fees;
	}
	void display()
	{
		System.out.println(this.ID+"  "+this.name+"  "+this.fees);

	}


}//class ends here 

class CourseClass
{
	public static void main(String[] args)
	{
			Course c1 = new Course();
			c1.setID(1);
			c1.setName("Java Full Stack");
			c1.setFees(40000);
		
			System.out.println(c1.getID());
			System.out.println(c1.getName());
			System.out.println(c1.getFees());
			c1.display();
	}//main ends here
}//class ends here
		