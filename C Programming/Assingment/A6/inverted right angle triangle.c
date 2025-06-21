#include<stdio.h>

void main()
{
	int no = 5;
	int i,j;
	
	for(i = 0; i <= no; i++)
	{
		for(j = 0; j <= no-i; j++)
		{
			printf("* ");
		}
		
		
		printf("\n");
	}
}