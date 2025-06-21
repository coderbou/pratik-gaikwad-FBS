#include <stdio.h>

void main() {
    int start, end;

    printf("Enter the start of range: ");
    scanf("%d", &start);
    printf("Enter the end of range: ");
    scanf("%d", &end);

    printf("\nEven numbers from %d to %d:\n", start, end);
    
	for (int i = start; i <= end; i++) 
	{
        if (i % 2 == 0) 
		{
            printf("%d ", i);
        }
    }

    printf("\n\nOdd numbers from %d to %d:\n", start, end);
    for (int i = start; i <= end; i++) 
	{
        if (i % 2 != 0) 
		{
            printf("%d ", i);
        }
    }

}
