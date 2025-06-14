#include <stdio.h>

void main() 
{
    int no, temp, rem, fact, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &no);
    temp = no;

    while (no > 0) 
	{
        rem = no % 10;
        fact = 1;
        while (rem > 0) 
		{
            fact = fact*rem;
            rem--;
        }
        sum = sum + fact;
        no /= 10;
    }

    if (sum == temp)
        printf("Strong\n");
    else
        printf("Not Strong\n");
}
