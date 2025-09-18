import java.util.Scanner;                             
class Bank
{
	int accno;
	String holdername;
	double balance;
	static double interest;
	
	static
	{
		interest=9.4;
	}
	
	void setAccno(int no)
	{
		this.accno=no;
	}
	void setHoldername(String name)
	{
		this.holdername=name;
	}
	void setBalance(double balance)
	{
		this.balance=balance;
	}
	 
	 static void setInterest (double r)
	{
		 interest=r;
	}
	
	int getAccno()
	{
		return this.accno;
	}
	String getHoldername()
	{
		return this.holdername;
	}
	double getBalance()
	{
		return this.balance;
	}
	
	double getInterest ()
	{
		return this.interest;
	}
		
	void display()
	{
		System.out.println("Account no is:"+this.accno);
		System.out.println("Holder Name is:"+this.holdername);
		System.out.println("Balance is:"+this.balance);
		System.out.println("Interest is:"+this.interest);
		System.out.println();

	}

	Bank()
	{
		this.accno=456;
		this.holdername="Akshata";
		this.balance=20.00;
		//this.interest=89;
	
	}
	Bank(int a,String n,double b)
	{
		this.accno=a;
		this.holdername=n;
		this.balance=b;
		//this.interest=i;
		
	}
}

class Test
{
	public static void main (String [] a)
	{
		Scanner sc=new Scanner(System.in);
		Bank b1=new Bank();
		b1.display();
		
		System.out.println("Enter a Holder Name:");
		String  name=sc.nextLine();
		
		System.out.println("Enter a A/c No:");
		int ac=sc.nextInt();
			
		System.out.println("Enter a balance:");
		double b=sc.nextDouble();
		sc.nextLine();
			
		System.out.println("Enter a Interest:");
		double i=sc.nextDouble();
		
		Bank b2=new Bank(ac,name,b);
		b2.display();
		
		Bank b3=new Bank(101,"Dhananjay",90000);
		b3.display();
		
		Bank.setInterest (4.7);
		b1.display();
		b3.display();
		
		
		
	}
}