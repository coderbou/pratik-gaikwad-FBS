class Salesmanger
{
	int id;
	String name;
	double salary;
	double incetive;
	int target;

	void setId(int id)
	{
		this.id=id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	void setIncetive(double incetive)
	{
		this.incetive=incetive;
	}

	void setTarget(int target)
	{
		this.target=target;
	}

	int getId()
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
	double getIncetive()
	{
		return this.incetive;
	}
	int getTarget()	
	{
		return this.target;
	}

	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("incetive:"+this.incetive);
		System.out.println("target:"+this.target);
	}


}

class Test
{
	public static void main(String [] a)
	{
		Salesmanger s1=new Salesmanger();
		
		s1.setId(10);
		s1.setName("Rohit");
		s1.setSalary(25000.0);
		s1.setIncetive(1000.0);
		s1.setTarget(10);

		s1.display();
	}
}