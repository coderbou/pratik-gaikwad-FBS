#include<stdio.h>

void main()
{
	int no = 5;
	int i,j;
	
	for(i = 0; i <= no; i++)
	{
		for(j = 0; j <= i-1; j++)
		{
			printf("* ");
		}
		
		
		printf("\n");
	}
}