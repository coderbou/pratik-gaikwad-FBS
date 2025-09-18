import java.util.Scanner;
class TestEvenOdd 
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
	 for (int i = 0; i < arr.length; i++) 
	  {
            	if (arr[i] % 2 == 0) 
                  {
                	System.out.println("even numbres:"+arr[i]);
                  }
		else
		  {
                	System.out.println("odd numbres:"+arr[i]);

		  }
       	  }

    	}
}
