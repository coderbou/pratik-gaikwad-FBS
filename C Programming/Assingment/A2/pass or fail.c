#include<stdio.h>
void main()
{
	int marks = 75;
	
	if (marks >= 75)
	{
		printf("A+");
	}
	else
	{
		if(marks>=65)
		{
			printf("B+");
		}
		else
		{
			if(marks>=55)
			{
				printf("C+");
			}
			else
			{
				if(marks>=35)
				{
					printf("Pass");
				}
				else
				{
					printf("Fail");
				}
			}
		}
	}
}