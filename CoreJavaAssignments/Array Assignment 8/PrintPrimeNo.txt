import java.util.Scanner;

class PrintPrimeNo 
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

 			System.out.print("Prime numbers in array: ");
        		for (int i = 0; i < arr.length; i++) {
            		int num = arr[i];
            		boolean isPrime = true;

            			if (num < 2) 
				{
                			isPrime = false;
            			} else 
				    {
                			for (int j = 2; j <= num / 2; j++) 					{
                    			if (num % j == 0) 
					{
                        			isPrime = false;
                        			break;
                    			}
                		   }
            			}

           			 if (isPrime) 
				{
               			    System.out.print(num + " ");
                  		}
        		}
    	}//main methods ends here
}//class AlternateNo ends here
