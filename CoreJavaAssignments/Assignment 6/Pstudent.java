import java.util.Scanner;

class Pstudent
{
    String c_name;
    double distance;
    String destination;

    // Setters
    void setCname(String cname)
    {
        this.c_name = cname;
    }
    void setDistance(double distance)
    {
        this.distance = distance;
    }
    void setDestination(String destination)
    {
        this.destination = destination;
    }

    // Getters
    String getCname()
    {
        return c_name;
    }
    double getDistance()
    {
        return distance;
    }
    String getDestination()
    {
        return destination;
    }

    // Display method
    void display()
    {
        System.out.println("Company Name: " + this.c_name);
        System.out.println("Distance: " + this.distance);
        System.out.println("Destination: " + this.destination);
    }

    Pstudent()
    {
        System.out.println("Default Constructor");

        this.c_name = "firstbit";
        this.distance = 1.5;
        this.destination = "hr";
    }

    Pstudent(String c, double di, String de)
    {
        System.out.println("Parameterized Constructor");

        this.c_name = c;
        this.distance = di;
        this.destination = de;
    }
}

class Test
{
    public static void main(String []a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Company Name:");
        String c = sc.nextLine();

        System.out.println("Enter Company Distance:");
        double d = sc.nextDouble();

        sc.nextLine(); 
        System.out.println("Enter a Job Destination:");
        String jd = sc.nextLine();

        
        Pstudent p = new Pstudent();
        p.display();

        
        Pstudent p1 = new Pstudent(c, d, jd);
        p1.display();
    }
}
