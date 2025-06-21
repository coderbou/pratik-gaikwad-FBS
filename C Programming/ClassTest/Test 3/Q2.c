#include <stdio.h>

void main() {
    int start, end , sum = 0;

    printf("Enter the start of range: ");
    scanf("%d", &start);
    printf("Enter the end of range: ");
    scanf("%d", &end);

    printf("\nAlternate number from %d to %d:\n", start, end);
    
    for (int i = start; i <= end; i = i + 2) 
	{
        printf("%d ", i);
        sum = sum + i;
    }
	printf("\n\nSum of alternate numbers = %d\n", sum);
}
