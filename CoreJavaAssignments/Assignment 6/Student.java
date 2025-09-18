import java.util.Scanner;
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
	Student()
	{
                System.out.println("Default Constructor");
		this.roll=101;
		this.name="pratik";
		this.marks=90.60;
	}
	Student(int r,String n, double m)
	{
                System.out.println("Parameterized Constructor");

		this.roll=r;
		this.name=n;
		this.marks=m;
	}
}

class Test
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll:");
		int r=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter student name:");
		String n=sc.nextLine();
		
		System.out.println("Enter Student Marks:");
		double m=sc.nextDouble();

		Student s1=new Student();
		s1.display();
		Student s2=new Student(r,n,m);
		s2.display();
	}
}