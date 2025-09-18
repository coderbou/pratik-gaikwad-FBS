import java.util.Scanner;
class distance
{
	double feet;
	double inches;
	
	void setFeet(double feet)
	{
		this.feet=feet;
	}
	void setInches(double inches)
	{
		this.inches=inches;
	}

	double getFeet()
	{
		return feet;
	}
	double getInches()	
	{
		return inches;
	}
	
	void display()
	{
		System.out.println("feet:"+this.feet);
		System.out.println("inches:"+this.inches);
	}
	distance()
	{
		System.out.println("Default Consturtor");
		this.feet=2.0;
		this.inches=25.2;
	}
	distance(double f,double i)
	{
		System.out.println("parameterized Construtor");
		this.feet=f;
		this.inches=i;
	}
	

}
class Test
{
	public static void main(String []a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a feet:");
		double f=sc.nextDouble();
		

		System.out.println("Enter a inches :");
		double i=sc.nextDouble();


		
	
		distance d=new distance();
		d.display();
		distance d1=new distance(f,i);
		d1.display();	
	}
}	