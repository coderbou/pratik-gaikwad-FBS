#include<stdio.h>

void main()
{
	int no = 5;
	int  i,j;
	
	for (i = 1; i <= no; i++)
	{
		for(j=1; j <= i; j++)
		{
			printf("* ");
		}
		printf("\n");
	}
}