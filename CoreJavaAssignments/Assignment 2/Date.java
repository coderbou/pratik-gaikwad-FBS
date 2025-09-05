class Date 
{
  int day,month,year;
  
  String dow;

   void setDay(int a)
   {
      this.day=a;
   }
  
   void setDow(String str)
   {
      this.dow=str;
   }
   void setYear(int b)
   {
      this.year=b;
   }
   void setMonth(int c)
   {
      this.month=c;
   }

   


} //class date ends here

class Test
{
   public static void main(String[] args)
     {

      Date d1 = new Date();
      d1.setDay(9);
      d1.setDow("Wed");
      d1.setYear(2025);
      d1.setMonth(9);

         
       //d1.dow="Wed";

       System.out.println(d1.day);
       System.out.println(d1.dow);
       System.out.println(d1.year);
       System.out.println(d1.month);





        
     }//main methods end here

}//class test ends here