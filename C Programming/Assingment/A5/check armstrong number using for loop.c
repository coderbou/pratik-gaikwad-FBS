#include <stdio.h>

void main() {
    int n;
    printf("Enter the upper limit: ");
    scanf("%d", &n);

    for (int num = 1; num <= n; num++) 
	{
        int temp = num;
        int sum = 0;
        int digits = 0;

        // Count number of digits
        for (int t = temp; t > 0; t /= 10) 
		{
            digits++;
        }

        // Calculate the sum of digits raised to the power of digits
        for (int t = temp; t > 0; t /= 10) 
		{
            int digit = t % 10;
            int power = 1;

            // Manually compute digit^digits using for loop
            for (int i = 0; i < digits; i++) 
			{
                power =power * digit;
            }

            sum =sum + power;
        }

        // Check if number is Armstrong
        if (sum == num) 
		{
            printf("%d ", num);
        }
    }

}
