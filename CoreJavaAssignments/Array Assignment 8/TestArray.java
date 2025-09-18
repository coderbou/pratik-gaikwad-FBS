import java.util.Scanner;
class TestArray 
{
    public static void main(String[] args) 
	{
	 
	 Scanner sc = new Scanner(System.in);
      	  int[] arr;
          arr = new int [5];

       	 for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the numbres");
			arr[i]=sc.nextInt();
        	}

        	int min = arr[0];
        	int max = arr[0];

        	for (int i = 1; i < arr.length; i++) 
		{
          	  if (arr[i] < min) 
	   	  {
               		 min = arr[i];
           	  }
            	 if (arr[i] > max) 
	         {
                   max = arr[i];
                 }
        }//for loops end here

        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);

    }//main methods end here
}//class ends here 
