#include <stdio.h>

void main() 
{
    int no, fact = 1;
    printf("Enter a number: ");
    scanf("%d", &no);

    while (no > 0) 
	{
        fact = fact * no;
        no--;
    }

    printf("Factorial = %d\n", fact);
}
