import java.util.Scanner;

class SearchArray 
  {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) 
         {
            if (arr[i] == key) {
                System.out.println("Number " + key + " found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + key + " not found in the array.");
        }

    }
}
