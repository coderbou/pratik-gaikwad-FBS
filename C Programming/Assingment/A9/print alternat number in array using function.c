#include <stdio.h>
void main() 
{
    int n;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++)
	{
        scanf("%d", &arr[i]);
    }

    // Call the function
    printAlternateElements(arr, n);
}
// Function to print alternate elements
void printAlternateElements(int arr[], int size) {
    printf("\nAlternate elements in the array: ");
    for (int i = 0; i < size; i = i + 2) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}


