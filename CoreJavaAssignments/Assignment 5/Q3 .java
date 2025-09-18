// Q3: Loan Approval using Overloading
class Student {
     int rollno;
     String name;
     double percentage;

    // Default constructor
    Student() {
        System.out.println("Student object created.");
    }

    // Parameterized constructor
    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    // Getters and Setters
    void setRollno(int rollno) {
        this.rollno = rollno;
    }
    int getRollno() {
        return rollno;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    double getPercentage() {
        return percentage;
    }
} // class Student ends here

class Employee {
    int id;
    String name;
    double annualSalary; // in lakhs

    // Default constructor
    Employee() {
        System.out.println("Employee object created.");
    }

    // Parameterized constructor
    Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }

    // Getters and Setters
    void setId(int id) {
        this.id = id;
    }
    int getId() {
        return id;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }

    void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    double getAnnualSalary() {
        return annualSalary;
    }
} // class Employee ends here

class Bank {
    void approveLoan(Student s) {
        if (s.getPercentage() > 80)
            System.out.println("Loan Approved = 2 Lakh");
        else if (s.getPercentage() >= 60)
            System.out.println("Loan Approved = 1 Lakh");
        else if (s.getPercentage() >= 40)
            System.out.println("Loan Approved = 50K");
        else
            System.out.println("No Loan Approved");
    }

    void approveLoan(Employee e) {
        if (e.getAnnualSalary() > 12)
            System.out.println("Loan Approved = 7 Lakh");
        else if (e.getAnnualSalary() >= 10)
            System.out.println("Loan Approved = 6 Lakh");
        else if (e.getAnnualSalary() >= 6)
            System.out.println("Loan Approved = 5 Lakh");
        else if (e.getAnnualSalary() >= 4)
            System.out.println("Loan Approved = 4 Lakh");
        else
            System.out.println("No Loan Approved");
    }

    public static void main(String[] args) {
        // Using parameterized constructor
        Student s1 = new Student(101, "Ravi", 75);
        Employee e1 = new Employee(201, "Amit", 11);

        // Using default constructor + setters
        Student s2 = new Student();
        s2.setRollno(102);
        s2.setName("Pratik");
        s2.setPercentage(85);

        Employee e2 = new Employee();
        e2.setId(202);
        e2.setName("Prathmesh");
        e2.setAnnualSalary(5);

        Bank b1 = new Bank();

        // Approve loans
        b1.approveLoan(s1); // via parameterized constructor
        b1.approveLoan(e1);

        b1.approveLoan(s2); // via setters
        b1.approveLoan(e2);
    }
} // class Bank ends here
