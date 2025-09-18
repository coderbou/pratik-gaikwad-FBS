class Shapes
{
	void calArea(Triangle t)
	{
		double area;
		area=0.5*t.getBase()*t.getHeight();
		System.out.println("Area of triangle : "+area);		
	}	

	void calArea(Circle c)
	{
		double area;
		area=3.14*c.getRadius()*c.getRadius();
		System.out.println("Area of circle : "+area);
	}

	void calArea(Rectangle r)
	{
		double area;
		area=r.getLength()*r.getBreadth();
		System.out.println("Area of rectangle : "+area);
	}

}//Class shape ends here

class Triangle
{
	double base;
	double height;

	Triangle()
	{
		this.base=4;
		this.height=3;
	}

	Triangle(double b ,double h)
	{
		this.base=b;
		this.height=h;
	}

	void setBase(double b)
	{
		this.base=b;
	}

	void setHeight(double h)
	{
		this.height=h;
	}

	double getBase()
	{
		return this.base;
	}

	double getHeight()
	{
		return this.height;
	}

	void display()
	{
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
	}
}//Class Triangle ends here

class Circle
{
	double radius;
	
	Circle()
	{
		this.radius=5;
	}
	
	Circle(double r)
	{
		this.radius=r;
	}

	void setRadius(double r)
	{
		this.radius=r;
	}
		
	double getRadius()
	{
		return this.radius;
	}
	
	void display()
	{
		System.out.println("Radius: "+this.radius);
	}
}//Class Circle ends here
	
class Rectangle
{
	double length;
	double breadth;
	
	Rectangle()
	{
		this.length=4;
		this.breadth=3;
	}
	Rectangle(double l,double b)
	{
		this.length=l;
		this.breadth=b;
	}

	void setLength(double l)
	{
		this.length=l;
	}
	void setBreadth(double b)
	{
		this.length=b;
	}
	
	double getLength()
	{
		return this.length;
	}
	double getBreadth()
	{
		return this.breadth;
	}
	void display()
	{
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}//Class Rectangle ends here

class Test
{
	public static void main(String [] args)
	{
		Shapes s1=new Shapes();
		Triangle t1=new Triangle(5,3);
		t1.display();
		s1.calArea(t1);

		Circle c1=new Circle(5);
		c1.display();
		s1.calArea(c1);

		Rectangle r1=new Rectangle(5,3);
		r1.display();
		s1.calArea(r1);
	}
}//Class test ends here
		

		

	

