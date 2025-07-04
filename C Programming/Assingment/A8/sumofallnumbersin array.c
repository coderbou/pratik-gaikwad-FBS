#include <stdio.h>

void main() 
{
    int n, i, sum = 0;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
    }

    for (i = 0; i < n; i++) 
	{
        sum = sum + arr[i];
    }

    printf("Sum of all elements: %d\n", sum);

}
