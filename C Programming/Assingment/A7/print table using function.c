#include<stdio.h>
void table();
void main()
{
	table();
}
void table()
{
	int n = 5;
	int i =1;
	printf("Enter the table :");
	scanf("%d",&n);
	while(i <= 10)
	{
		printf("%d\n",n*i);
		i++;
	}
}