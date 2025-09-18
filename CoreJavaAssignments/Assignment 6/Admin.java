import java.util.Scanner;
class Admin
{
	int id;
	String name;
	double salary;
	double adminallows;
	
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
	void setAdminallows(double adminallows)
	{
		this.adminallows=adminallows;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
 	double getSalary()
	{
		return salary;
	}
	double getAdminall()
	{
		return adminallows;
	}
	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("adminall:"+this.adminallows);		
	}
	Admin()
	{
		this.id=201;
		this.name="firstbit admin";
		this.salary=6000.02;
		this.adminallows=150.30;
		System.out.println("Default Constructor:");
	}
	Admin(int id,String a, double s,double aa)
	{
		this.id=id;
		this.name=a;
		this.salary=s;
		this.adminallows=aa;
		System.out.println("Parameterized Constructor:");
	}

	
		
}
class Test
{
	public static void main(String []a)
 {
	Scanner sc=new Scanner(System.in);

	

	System.out.println("Enter a name:");
	String name=sc.nextLine();
	
	System.out.println("Enter a id:");
	int id=sc.nextInt();

	System.out.println("Enter a Salary:");
	double salary=sc.nextDouble();

	System.out.println("Enter a Addmistion allows:");
	double allows=sc.nextDouble();

	Admin a1=new Admin();
	a1.display();
	Admin a2=new Admin(id,name,salary,allows);
	a2.display();
 }

}	