import java.util.Scanner;                             

class ElectricityBill {
    int b_id;
    String name;
    int units;
    static double RatePerUnit;

    static {
        RatePerUnit = 9;  
    }

    // Setters
    void setB_id(int no) {
        this.b_id = no;
    }

    void setName(String name) {
        this.name = name;
    }

    void setUnits(int u) {
        this.units = u;
    }

    static void setRatePerUnit(double r) {
        RatePerUnit = r;
    }

    // Getters
    int getB_id() {
        return this.b_id;
    }

    String getName() {
        return this.name;
    }

    int getUnits() {
        return this.units;
    }

    double getRatePerUnit() {
        return RatePerUnit;
    }

    void display() {
        System.out.println("Bill Id is: " + this.b_id);
        System.out.println("Biller Name is: " + this.name);
        System.out.println("No of units is: " + this.units);
        System.out.println("Rate per unit is: " + RatePerUnit);
        System.out.println("Total Bill = " + (this.units * RatePerUnit));
        System.out.println();
    }

    ElectricityBill() {
       System.out.println("Default constructor");
        this.b_id = 101;
        this.name = "Akshata";
        this.units = 20;
    }

    ElectricityBill(int a, String n, int b) 
    {
       System.out.println("Parameterized constructor");

        this.b_id = a;
        this.name = n;
        this.units = b;
    }
}//class ElectricityBill ends here


class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectricityBill e1 = new ElectricityBill();
        e1.display();

        System.out.println("Enter a id:");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter a name:");
        String name = sc.nextLine();

        System.out.println("Enter number of units:");
        int uni = sc.nextInt();

        System.out.println("Enter Rate per unit:");
        double r = sc.nextDouble();

        ElectricityBill e2 = new ElectricityBill(id, name, uni);
        ElectricityBill.setRatePerUnit(r);
        e2.display();

        ElectricityBill e3 = new ElectricityBill(102, "Trupti", 90);
        e3.display();

        ElectricityBill.setRatePerUnit(4);
        e1.display();
        e3.display();

    }// main methods end here
}//class Test ends here
