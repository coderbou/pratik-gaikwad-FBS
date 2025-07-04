#include<stdio.h>
void findage();
void main()
{
	findage();
}
void findage()
{
	int age;
	printf("enter your age");
	scanf("%d",&age);
	
	if(age <= 12)
	{
		printf("child");
	}
	else
	{
		if(age >= 13 && age <= 18)
		{
			printf("Teenager");
		}
		else
		{
			if(age <= 59)
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