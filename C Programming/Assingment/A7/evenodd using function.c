int evenodd();
void main()
{
	
	int res = evenodd();
	if(res==1)
	{
		printf("No is even");	
		}
	else{
		printf("No is odd");
	}
	
}
int	evenodd()
	{
	int no;
	printf("enter the number");
	scanf("%d",&no);
	if(no%2==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
