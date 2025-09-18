import java.util.Scanner;

class TestMerged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] merged = new int[arr1.length + arr2.length];

        System.out.println("Enter the first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // Copy arr1 into merged
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy arr2 into merged
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged array: ");
	for (int i = 0; i < merged.length; i++) {
	    System.out.print(merged[i] + " ");
	}

        sc.close();
    }
}
