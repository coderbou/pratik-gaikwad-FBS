#include<stdio.h>
void traingle1();
void main()
{
	traingle1();
}
void traingle1()
{
	int side1 = 2;
	int side2 = 2;
	int side3 = 2;
	
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
	}
	else
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
	
	