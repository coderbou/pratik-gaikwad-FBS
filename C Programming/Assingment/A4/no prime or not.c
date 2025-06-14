#include<stdio.h>

void main()
{
	int no,i,count=0;
	printf("Enter the number:");
	scanf("%d",&no);
	
	if(no <= 1)
	{
		printf("the number is not prime");
	}
	
	for(i=2;i<=no/2;i++)
	{
		if(no%i==0)
		{
			count = 1;
			break;
		}
	}
		if(count == 0)
		{
			printf("the number is prime");
		}
		else{
			printf("the number is not prime");
		}
}