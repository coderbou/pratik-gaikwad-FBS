import java.util.Scanner;                             
class Bank
{
	int accno;
	String holdername;
	double balance;
	String branch;

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
	void setBranch(String branch)
	{
		this.branch=branch;
	}
	int getAccno()
	{
		return accno;
	}
	String getHoldername()
	{
		return holdername;
	}
	double getBalance()
	{
		return balance;
	}
	String getBranch()
	{
		return branch;
	}
	void display()
	{
		System.out.println("Account no:"+this.accno);
		System.out.println("Holder Name:"+this.holdername);
		System.out.println("Balance:"+this.balance);
		System.out.println("Branch:"+this.branch);
	}
	Bank()
	{
                System.out.println("Default Constructor");

		this.accno=656;
		this.holdername="ICICI";
		this.balance=20.00;
		this.branch="pune";
 
	}
	Bank(int a,String n,String b,double ba)
	{
		this.accno=a;
		this.holdername=n;
		this.balance=ba;
		this.branch=b;

                System.out.println("Parameterized Constructor");

	}
}

class Test
{
	public static void main (String [] a)
	{
		Scanner sc=new Scanner(System.in);
		Bank b1=new Bank();
		
		System.out.println("Enter a Holder Name:");
		String  name=sc.nextLine();
		
		System.out.println("Enter a A/c No:");
		int ac=sc.nextInt();
		
			
		System.out.println("Enter a balance:");
		double b=sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter a Branch:");
		String bra=sc.nextLine();
		
		
		b1.display();
		Bank b2=new Bank(ac,name,bra,b);
		b2.display();
	}
}	