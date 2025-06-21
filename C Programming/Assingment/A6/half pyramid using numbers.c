#include<stdio.h>

void main()
{
	int no;
	printf("Enter the number : ");
	scanf("%d",&no);
	
	for (int i = 1; i <= no; i++)
	{
		for(int j = 1; j <= i + 1; j++)
		{
			printf("%d",j);
		}
		printf("\n");
	}
}