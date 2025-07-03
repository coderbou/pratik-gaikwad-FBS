// write a program two array and fine their common number
#include <stdio.h>
void main() 
{
    int A[5], B[5];
    int i, j;

    
    printf("Enter %d elements for first array: ", A[5]);
    for(i = 0; i < 5; i++) 
	{
        scanf("%d", &A[i]);
    }

    
    printf("Enter %d elements for second array: ", B[5]);
    for(i = 0; i < 5; i++) 
	{
        scanf("%d", &B[i]);
    }

    printf("Common elements are: ");
    for(i = 0; i < 5; i++) 
	{
        for(j = 0; j < 5; j++) 
		{
            if(A[i] == B[j]) 
			{
                printf("%d ", A[i]);
                break;
            }
        }
    }
}
