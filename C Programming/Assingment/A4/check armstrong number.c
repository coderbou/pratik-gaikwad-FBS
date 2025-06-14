#include <stdio.h>

void main() 
{
    int no, temp, rem, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &no);
    temp = no;

    while (no > 0) 
	{
        rem = no % 10;
        sum = sum + rem * rem * rem;
        no /= 10;
    }

    if (sum == temp)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");
}
