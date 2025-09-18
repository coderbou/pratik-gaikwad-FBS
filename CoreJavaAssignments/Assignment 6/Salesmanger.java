import java.util.Scanner;
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

	Salesmanger()
	{
                System.out.println("Defalut Constutor");

		this.id=103;
		this.name="Pratik";
		this.salary=55000.0;
		this.incetive=2500.0;
		this.target=100;
     
	}

	Salesmanger(int i,String n,double s, double in, int t)
	{
                System.out.println("Parameterized Constutor");

		this.id=i;
		this.name=n;
		this.salary=s;
		this.incetive=in;
		this.target=t;
	}
}

class Test
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter employe name:");
		String name=sc.nextLine();

		System.out.println("Enter Employe salary:");
		double s=sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter employe incetive:");
		double i=sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter employe target:");
		int t=sc.nextInt();
	
		Salesmanger s1=new Salesmanger();
		s1.display();
		Salesmanger s2=new Salesmanger(id,name,s,i,t);
		s2.display();

	}
}