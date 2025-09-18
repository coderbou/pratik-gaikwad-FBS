import java.util.Scanner;

class Product 
{
     int pid;
     String pname;
     double costPrice;
     int quantity;

     static double discount; 

    static 
    {
        discount = 10; 
    }

    
    // Setters
    void setPid(int pid) 
    {
        this.pid = pid;
    }

    void setPname(String pname) 
    {
        this.pname = pname;
    }

    void setCostPrice(double costPrice) 
    {
        this.costPrice = costPrice;
    }

    void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    static void setDiscount(double d) 
    {
        discount = d;
    }

    // Getters
    int getPid() 
    {
        return pid;
    }

    String getPname() 
    {
        return pname;
    }

    double getCostPrice() 
    {
        return costPrice;
    }

    int getQuantity() 
    {
        return quantity;
    }

    static double getDiscount() {
        return discount;
    }

    double getDiscountedPrice() 
    {
        return costPrice - (costPrice * discount / 100);
    }

    double calculateSellingPrice() 
    {
        return getDiscountedPrice() * quantity;
    }

    void display() 
   {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Cost Price: " + costPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Price per unit: " + getDiscountedPrice());
        System.out.println("Total Selling Price: " + calculateSellingPrice());
        System.out.println();
    }

 // Constructors
    Product() 
   {
        this.pid = 101;
        this.pname = "DefaultProduct";
        this.costPrice = 100;
        this.quantity = 1;
    }

    Product(int pid, String pname, double costPrice, int quantity) 
   {
        this.pid = pid;
        this.pname = pname;
        this.costPrice = costPrice;
        this.quantity = quantity;
    }

} // class Product ends here

class Test 
{
    public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.display();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Discount (%): ");
        double d = sc.nextDouble();

        Product p2 = new Product(id, name, cp, qty);
        Product.setDiscount(d); // update common discount
        p2.display();

        Product p3 = new Product(103, "Laptop", 50000, 2);
        p3.display();

        Product.setDiscount(20);
        p1.display();
        p3.display();

    }//main methods end here
} // class Test ends here
