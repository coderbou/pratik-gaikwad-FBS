#include <stdio.h>

void main() {
    int n;
    printf("Enter the upper limit: ");
    scanf("%d", &n);

    for (int num = 2; num <= n; num++)
	  {
        int isPrime = 1;  // Assume it's a prime

        for (int i = 2; i < num; i++) 
		{
            if (num % i == 0) 
			{
                isPrime = 0; // Not prime
                break;
            }
        }

        if (isPrime) 
		{
            printf("%d ", num);
        }
    }
}
