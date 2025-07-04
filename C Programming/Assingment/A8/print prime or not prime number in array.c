#include <stdio.h>

void main() 
{
    int n, i, j;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("\nPrime numbers in the array: ");
    for (i = 0; i < n; i++) 
	{
        int num = arr[i];
        int count = 0;

        if (num <= 1) {
            continue; 
        }

        for (j = 2; j < num; j++) 
		{
            if (num % j == 0) 
			{
                count++;
                break;
            }
        }

        if (count == 0) 
		{
        	printf("%d ", num);
        }
    }

    printf("\n");

}

