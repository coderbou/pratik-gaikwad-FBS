#include <stdio.h>

void main() 
{
    int num, originalNum, remainder, result = 0, n = 0;

    printf("enter a number: ");
    scanf("%d", &num);

    originalNum = num;

    for (int temp = num; temp != 0; temp /= 10) 
	{
        n++;
	}
    for (int temp = num; temp != 0; temp /= 10) 
	{
        remainder = temp % 10;
        result += pow(remainder, n);
    }

    if (result == num)
        printf("%d Armstrong \n", num);
    else
        printf("%d is not Armstrong \n", num);
}
