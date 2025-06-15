#include <stdio.h>

void main() 
{
    int n;
    printf("Enter the upper limit: ");
    scanf("%d", &n);

    for (int num = 1; num <= n; num++) 
	{
        int temp = num;
        int sum = 0;

        // Loop through each digit
        for (int t = temp; t > 0; t /= 10) 
		{
            int digit = t % 10;
            int fact = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
        }

        // Check if number is Strong
        if (sum == num) 
		{
            printf("%d ", num);
        }
    }
}
