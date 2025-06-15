#include <stdio.h>

void main() 
{
    char ch;
    printf("Enter a character: ");
    scanf(" %c", &ch);

    if (ch >= 'A' && ch <= 'Z')
	{
        printf("Uppercase letter\n");
    } 
	else if (ch >= 'a' && ch <= 'z') 
	{
        printf("Lowercase letter\n");
    } 
	else 
	{
        printf("Not an alphabet character\n");
    }
}
