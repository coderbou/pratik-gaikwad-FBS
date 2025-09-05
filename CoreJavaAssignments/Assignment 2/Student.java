class Student 
{
  int id;
  
  String name;

  double marks;

   void setId(int a)
   {
      this.id=a;
   }
  
   void setName(String str)
   {
      this.name=str;
   }
   void setMarks(double b)
   {
      this.marks=b;
   }
   

} //class date ends here

class Test
{
   public static void main(String[] args)
     {

      Student s1 = new Student();
      s1.setId(105);
      s1.setName("Pratik");
      s1.setMarks(75);
      

       System.out.println(s1.id);
       System.out.println(s1.name);
       System.out.println(s1.marks);

        
     }//main methods end here

}//class test ends here