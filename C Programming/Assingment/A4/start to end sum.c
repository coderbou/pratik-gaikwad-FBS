#include<stdio.h>

void main()
{
	int start = 1;
	int end = 5;
	int sum=0;
	int i = start;
	
	while(i <= end)
	{
		sum = sum + i;
		i++;
	}
	
	printf("%d",sum);
}
