#include<stdio.h>

void main ()
{
	int start,end;
	printf("Enter the start number: ");
	scanf("%d",&start);
	
	printf("Enter the last number: ");
	scanf("%d",&end);
	
	for(int i = start; i <= end; i++)
	{
		printf("Factorial of %d = ",i);
		for(int j =1 ; j <= i; j++)
		{
			if(i % j == 0)
			{
				printf("%d ,",j);
			}
			
		}
		
		printf("\n");
	}
}