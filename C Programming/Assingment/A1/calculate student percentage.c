void main()
{
	int sub1 = 40;
	int sub2 = 60;
	int sub3 = 97;
	int sub4 = 80;
	int sub5 = 76;
	
	int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
	float percentage = (totalmarks / 500.0) * 100;
	
	printf("sub1: %d\n",sub1);
	printf("sub2: %d\n",sub2);
	printf("sub3: %d\n",sub3);
	printf("sub4: %d\n",sub4);
	printf("sub5: %d\n",sub5);
	
	printf("taotalmarks:%d\n",totalmarks);
	printf("percentage: %f",percentage);
}