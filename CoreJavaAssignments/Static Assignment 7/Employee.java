import java.util.Scanner;

class Employee 
{
    String name;
    double basicSalary;

    static double companyBonusRate;

    static 
    {
        companyBonusRate = 10; // default 10%
    }

    
    // Setters
    void setName(String name) 
    {
        this.name = name;
    }

    void setBasicSalary(double salary) 
    {
        this.basicSalary = salary;
    }

    static void setCompanyBonusRate(double rate) 
    {
        companyBonusRate = rate;
    }

    // Getters
    String getName() 
    {
        return this.name;
    }

    double getBasicSalary() 
    {
        return this.basicSalary;
    }

    static double getCompanyBonusRate() 
    {
        return companyBonusRate;
    }

    double calculateTotalSalary() {
        return basicSalary + (basicSalary * companyBonusRate / 100);
    }

    void display() 
   {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Company Bonus Rate: " + companyBonusRate + "%");
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println();
    }
   // Constructors
     Employee() 
    {
        this.name = "Akshata";
        this.basicSalary = 30000;
    }

    Employee(String n, double s) {
        this.name = n;
        this.basicSalary = s;
    }

} // class Employee ends here

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        e1.display();

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter Company Bonus Rate (%): ");
        double rate = sc.nextDouble();

        Employee e2 = new Employee(name, salary);
        Employee.setCompanyBonusRate(rate);
        e2.display();

        Employee e3 = new Employee("Rohit", 40000);
        e3.display();

        Employee.setCompanyBonusRate(20);
        e1.display();
        e3.display();

    }// main methods end here
} // class Test ends here
