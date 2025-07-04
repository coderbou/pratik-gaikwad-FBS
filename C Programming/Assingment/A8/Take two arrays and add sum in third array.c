#include <stdio.h>

void main() 
{
    int n, i;

    printf("Enter size of the arrays: ");
    scanf("%d", &n);

    int arr1[n], arr2[n], sum[n];

    printf("Enter %d elements for first array: ", n);
    for (i = 0; i < n; i++) 
	{
        scanf("%d", &arr1[i]);
    }

    printf("Enter %d elements for second array: ", n);
    for (i = 0; i < n; i++) 
	{
        scanf("%d", &arr2[i]);
    }

    for (i = 0; i < n; i++) 
	{
        sum[i] = arr1[i] + arr2[i];
    }

    printf("\nSum stored in third array: ");
    for (i = 0; i < n; i++) 
	{
        printf("%d ", sum[i]);
    }

    printf("\n");

}
