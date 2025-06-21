#include<stdio.h>

void main() 
{
    int no;
    printf("Enter the Number : ");
    scanf("%d",&no);

    for (int i = 0; i < no; i++) 
	{
        for (int space = 0; space < i; space++) 
		{
            printf(" ");
        }
        for (int star = 0; star < no - i; star++) 
		{
            printf("* ");
        }

        printf("\n"); 
    }

}
