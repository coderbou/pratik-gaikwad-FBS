import java.util.Scanner;

class TestSum
  {
	public static void main(String[] args)
	   {
		Scanner sc=new Scanner(System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] sum = new int[5];
		
		System.out.println("Enter the first array:");
		for(int i=0;i<arr1.length;i++)
		{
		   arr1[i]=sc.nextInt();
		}

		System.out.println("Enter the Second array:");
		for(int i=0;i<arr2.length;i++)
		{
		   arr2[i]=sc.nextInt();
		}

		for(int i=0;i<sum.length;i++)
		{
		   sum[i]=arr1[i]+arr2[i];
		}

		for(int i=0;i<sum.length;i++)
		{
		   System.out.println("Sum of two Arrays is :"+sum[i]);
		}

	  }//main ends here

}// class ends here