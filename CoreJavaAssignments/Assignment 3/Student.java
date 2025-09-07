class Student
{
	int roll;
	String name;
	double marks;

	void setRoll(int roll)
	{
		this.roll=roll;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setMarks(double marks)
	{
		this.marks=marks;
	}
	int getRoll()
	{
		return this.roll;
	}
	String getName()
	{
		return this.name;
	}
	double getMarks()
	{
		return this.marks;
	}
	void display()	
	{
		System.out.println("id:"+this.roll);
		System.out.println("name:"+this.name);
		System.out.println("marks:"+this.marks);
	}
}

class Test
{
	public static void main(String [] a)
	{
		Student s1=new Student();
		
		s1.setRoll(101);
		s1.setName("Rohit");
		s1.setMarks(75.11);
		
		s1.display();
	}
}