class Emp
{
	int id;
	String name;
	double salary;
	
	void setid(int id)
	{
		this.id=id;
	}
	
	void setname(String name)
	{
		this.name=name;
	}
	
	void setsalary(double salary)	
	{
		this.salary=salary;	
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
	void display()
	{
	
		System.out.println(this.id+"-"+this.name+"-"+this.salary);
	}

        Emp(int i, String str,double a)
          {
              this.id=i;
              this.name=str;
              this.salary=a;
              System.out.println("Parameter constructor");

          }

        Emp ()
         {
             this.id=101;
             this.name="Ram";
             this.salary=5000.00;

              System.out.println("default constructor");

         }


}
class Test
{
	public static void main(String []a)
	{
		Emp e1=new Emp();
		e1.setid(101);
		e1.setname("ram");
		e1.setsalary(5000.00);
		e1.display();

		Emp e2=new Emp(102,"pratik",6000.00);
		e2.display();


	}
}