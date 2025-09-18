class Student
{
    int roll;
    String name;
    double marks;

    void setRoll(int roll)
    {
        this.roll = roll;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setMarks(double marks)
    {
        this.marks = marks;
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

   
  // Default Constructor
    Student()
    {
        this.roll = 0;
        this.name = "Unknown";
        this.marks = 0.0;
        System.out.println("Default constructor");
    }

    // Parameterized Constructor
    Student(int roll, String name, double marks)
    {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        System.out.println("Parameterized constructor");
    }


}

class TestStudent
{
    public static void main(String[] args)
    {
        // Default constructor
        Student s1 = new Student();
        s1.display();

        s1.setRoll(101);
        s1.setName("Rohit");
        s1.setMarks(75.11);
        s1.display();

        // Parameterized constructor
        Student s2 = new Student(102, "Ajay", 88.55);
        s2.display();
    }
}
