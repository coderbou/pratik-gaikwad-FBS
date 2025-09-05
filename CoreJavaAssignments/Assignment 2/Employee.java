class Employee 
{
  int id;
  
  String name;
 
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
   
} //class Employee ends here

class Test
{
   public static void main(String[] args)
     {

    Employee e1 = new Employee();
      e1.setId(101);
      e1.setName("Pratik");
      e1.setSalary(50000);
      
       System.out.println(e1.id);
       System.out.println(e1.name);
       System.out.println(e1.salary);
               
     }//main methods end here

}//class test ends here