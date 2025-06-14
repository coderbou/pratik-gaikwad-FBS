#include<stdio.h>

void main()
{
	int no,res;
	printf("Enter the bill :");
	scanf("%d",&no);
	
	if(no >= 1 && no <= 50)
	{
		res = no * 30;
		printf("your unit is %d",res);
	}
		else if(no >=51 && no <= 150)
		{
			res = no *40;
			printf("your unit is %d",res);
		}
		else if(no>=151)
		{
			res = no * 50;
			printf("your unit is %d",res);
		}
		
}