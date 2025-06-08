#include<stdio.h>

void main()
{
	int side1 = 2;
	int side2 = 3;
	int side3 = 5;
	
	if(side1 == side2)
	{
		if(side2 == side3)
		{
			printf("Equilateral triangle");
		}
		else
		{
			printf("Isosceles Triangle");
		}
	}else
	{
		if(side1 == side2 || side2 == side3)
		{
			printf("Isosceles Triangle");
		}
		else
		{
			printf("scalene triangle");
		}
	}
	}