
#include <stdio.h>

void main() 
{
    int n, i, key, found = 0;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
    }

    printf("Enter number to search: ");
    scanf("%d", &key);

    for (i = 0; i < n; i++) 
	{
        if (arr[i] == key) 
		{
            printf("Number %d found at position %d.\n", key, i + 1);
            found = 1;
            break; 
        }
    }

    if (found == 0) 
	{
        printf("Number %d not found in the array.\n", key);
	}
}
