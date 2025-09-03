class StudPassOrfail
   {
      public static void main(String[] args)

          {
            int marks = 30;
 
            if(marks >= 75)
              {
                 System.out.println("Distinction");
              }
               else if(marks >= 65 && marks < 75)
                  {
                     System.out.println("First class");
                  }
                   else if(marks >= 40 && marks < 65)
                     {
                        System.out.println("Pass");
                     }
                       else
                         {
                            System.out.println("Fail");
                         }

          }//main methods end here

   }//class StudPassOrfail ends here