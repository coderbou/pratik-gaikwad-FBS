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

    printf("\nEven numbers in the array: ");
    for (i = 0; i < n; i++) 
	{
        if (arr[i] % 2 == 0) 
		{
            printf("%d ", arr[i]);
        }
    }

    printf("\nOdd numbers in the array: ");
    for (i = 0; i < n; i++) 
	{
        if (arr[i] % 2 != 0) 
		{
            printf("%d ", arr[i]);
        }
    }

    printf("\n");
}
