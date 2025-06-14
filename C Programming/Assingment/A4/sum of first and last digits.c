#include <stdio.h>

void main() 
{
    int no, first, last;
    printf("Enter a number: ");
    scanf("%d", &no);

    last = no % 10;
    while (no >= 10) 
	{
        no = no / 10;
    }
    first = no;

    printf("Sum of first and last digit = %d\n", first + last);
}
