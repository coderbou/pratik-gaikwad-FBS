class Salesmaneger 
{
  int id;
  int target;
  String name;
  int incentive;
  int salary;

   void setId(int a)
   {
      this.id=a;
   }
  
   void setName(String str)
   {
      this.name=str;
   }

   void setSalary(int b)
   {
      this.salary=b;
   }

   void setIncentive(int q)
   {
      this.incentive=q;
   }

   void setTarget(int c)
   {
      this.target=c;
   }



   
} //class Employee ends here

class Test
{
   public static void main(String[] args)
     {

    Salesmaneger s1 = new Salesmaneger();
      s1.setId(101);
      s1.setName("Pratik");
      s1.setSalary(50000);
      s1.setIncentive(2000);
      s1.setTarget(50);

       System.out.println("Id :"+s1.id);
       System.out.println("Name : "+s1.name);
       System.out.println("Salary : "+s1.salary);
       System.out.println("Target is :"+s1.target);
       System.out.println("work Incentive : "+s1.incentive);

     }//main methods end here

}//class test ends here