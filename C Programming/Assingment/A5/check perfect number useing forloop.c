#include <stdio.h>

void main() 
{
    int n;
    printf("Enter the upper limit: ");
    scanf("%d", &n);

    for (int num = 1; num <= n; num++) 
	{
        int sum = 0;

        // Find divisors of num 
        for (int i = 1; i < num; i++) 
		{
            if (num % i == 0) 
			{
                sum += i;
            }
        }

        // Check if num is a perfect number
        if (sum == num) 
		{
            printf("%d ", num);
        }
    }
}
