import java.util.Scanner;

class AlternateNo 
{
    public static void main(String[] args) 
      {
        	Scanner sc = new Scanner(System.in);

        	int[] arr = new int[5];
        	System.out.println("Enter 5 numbers:");
        	for (int i = 0; i < arr.length; i++) 
		  {
          		arr[i] = sc.nextInt();
        	  }

        	    System.out.print("Alternate elements: ");
        		for (int i = 0; i < arr.length; i = i + 2) 
			{
            			System.out.print(arr[i] + " ");
        		}
    	}//main methods ends here
}//class AlternateNo ends here
