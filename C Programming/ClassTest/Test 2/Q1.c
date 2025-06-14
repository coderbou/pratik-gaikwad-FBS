#include<stdio.h>

void main ()
{
	int no;
	printf("Enter the no :");
	scanf("%d",&no);
	 if(no>0)
	 	printf("no is positive");
		else if(no == 0)
		printf("no is neutral");
		else
			printf("no is negative");
}