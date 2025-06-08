#include<stdio.h>
void main()
{
	int a = 2;
	int b = 3;
	char op = '/';
	
	if(op == '+')
	{
		printf("Addition:%d", a + b);
	}
	else
	{
		if(op == '-')
		{
			printf("Subtraction is: %d", a - b);
		}
		else
		{
			if(op == '*')
			{
				printf("Multipication is: %d", a * b);
			}
			else
			{
				if(op == '%')
				{
					printf("Modulo is: %d", a % b);
				}
				else
				{
					printf("division is: %d", a / b);
				}
			}
		}
	}
}