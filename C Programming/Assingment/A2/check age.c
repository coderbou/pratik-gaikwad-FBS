#include<stdio.h>

void main()
{
	int age = 40;
	
	if(age < 12)
	{
		printf("child");
	}
	else
	{
		if(12 > 19)
		{
			printf("Teenager");
		}
		else
		{
			if(20 >= 59)
			{
				printf("Adult");
			}
			else
			{
				printf("senior");
			}
		}
	}
}