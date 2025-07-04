#include <stdio.h>

void main() 
{
    int n, i;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
    }

    printf("\nOriginal array: ");
    for (i = 0; i < n; i++) 
	{
        printf("%d ", arr[i]);
    }

    printf("\nReversed array: ");
    for (i = n - 1; i >= 0; i--) 
	{
        printf("%d ", arr[i]);
    }

    printf("\n");
}
