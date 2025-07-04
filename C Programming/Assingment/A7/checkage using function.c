#include<stdio.h>
int checkage();
void main()
{
  int resl=checkage();
  if(resl == 1)
  {
  	printf("child");
  }
  else if(resl == 2)
  {
  	printf("tenager");
  }else if(resl == 3)
  {
  	printf("Adult");
  }
  else{
  	printf("senior");
  }
}

int checkage()
{
	int age;
	printf("Enter the no");
	scanf("%d",&age);
	
	if(age <= 12)
	{
		return 1;
	}
	else
	{
		if(age > 19)
		{
			return 2;
		}
		else
		{
			if(age >= 59)
			{
				return 3;
			}
			else
			{
				return 4;
			}
		}
	}
}