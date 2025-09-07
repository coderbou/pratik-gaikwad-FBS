class Distance
{
	double feet;
	double inches;

	void setFeet(double f)
	{
		this.feet=f;
	}
	void setInches(double i)
	{
		this.inches=i;
	}


	double getFeet()
	{
		return this.feet;
	}
	double getInches()
	{
		return this.inches;
	}

	void display()
	{
		System.out.println(this.feet+" "+this.inches);
	}

} //class ends here


class DistanceClass
{

	public static void main(String[] args)
	{
		Distance d1=new Distance();
		d1.setFeet(5);
		d1.setInches(9);
	
		System.out.println(d1.getFeet());
		System.out.println(d1.getInches());
	
		d1.display();
	}
}	