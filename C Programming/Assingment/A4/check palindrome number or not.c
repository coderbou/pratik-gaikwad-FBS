#include <stdio.h>

void main() 
{
    int no, rev = 0, rem, temp;
    printf("Enter a number: ");
    scanf("%d", &no);
    temp = no;

    while (no > 0) 
	{
        rem = no % 10;
        rev = rev * 10 + rem;
        no = no / 10;
    }

    if (rev == temp)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");
}
