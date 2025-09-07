class Placedstudent
{
	
	String sname;
	double distance;
	String designation;

	void setSname(String a)
	{
		this.sname= a;
	}
	void setDistance(double d)
	{
		this.distance= d;
	}
	void setDesignation(String c)
	{
		this.designation= c;
	}

	String getSname()
	{
		return this.sname;
	}
	double getDistance()
	{
		return this.distance;
	}
	String getDesignation()
	{
		return this.designation;
	}

	void display()
	{
		System.out.println(this.sname+"  "+this.distance+"  "+this.designation);

	}


}//class ends here 

class std
{
	public static void main(String[] args)
	{
			Placedstudent s1 = new Placedstudent();
		
			s1.setSname("Radha");
			s1.setDistance(10);
			s1.setDesignation("Graduation");
			
		
			
			System.out.println(s1.getSname());
			System.out.println(s1.getDistance());
			System.out.println(s1.getDesignation());
			s1.display();
	}//main ends here
}//class ends here
		