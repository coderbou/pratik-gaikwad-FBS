#include<stdio.h>

void main()
{
	int year;
	 printf("enter year : ");
	 scanf("%d",&year);
	 
	 if(year%4==0)
	 {
	 	printf("its leap year");
	 }
	 else
	 {
	 	printf("its not leap year");
	 }
}