import java.util.Scanner;

class SumOfNo 
{
    public static void main(String[] args) 
      {
        	Scanner sc = new Scanner(System.in);
		int sum = 0;
        	int[] arr = new int[5];
        	System.out.println("Enter 5 numbers:");
        	for (int i = 0; i < arr.length; i++) 
		  {
          		arr[i] = sc.nextInt();
        	  }

        		for (int i = 0; i < arr.length; i++) 
			{
            			sum = sum + arr[i];
        		}
				System.out.println(sum);
    	}//main methods ends here
}//class AlternateNo ends here
