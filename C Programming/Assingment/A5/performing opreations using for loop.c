#include <stdio.h>

int main() 
{
    int num, choice;
    printf("Enter a number: ");
    scanf("%d", &num);

    printf("\nChoose an option:\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Sum of Digits\n");
    printf("Enter your choice (1-6): ");
    scanf("%d", &choice);

    int i, temp, rev = 0, sum = 0;

    if (choice == 1) 
	{
        if (num % 2 == 0)
            printf("%d is Even\n", num);
        else
            printf("%d is Odd\n", num);
    }

    else if (choice == 2) 
	{
        if (num <= 1) 
		{
            printf("%d is not Prime\n", num);
        } else {
            int isPrime = 1;
            for (i = 2; i < num; i++) 
			{
                if (num % i == 0) 
				{
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime)
                printf("%d is Prime\n", num);
            else
                printf("%d is not Prime\n", num);
        }
    }

    else if (choice == 3) 
	{
        temp = num;
        for (; temp != 0; temp /= 10) 
		{
            rev = rev * 10 + (temp % 10);
        }
        if (rev == num)
            printf("%d is a Palindrome\n", num);
        else
            printf("%d is not a Palindrome\n", num);
    }

    else if (choice == 4) 
	{
        if (num > 0)
            printf("%d is Positive\n", num);
        else if (num < 0)
            printf("%d is Negative\n", num);
        else
            printf("Number is Zero\n");
    }

    else if (choice == 5) 
	{
        temp = num;
        for (; temp != 0; temp /= 10) 
		{
            rev = rev * 10 + (temp % 10);
        }
        printf("Reversed number = %d\n", rev);
    }

    else if (choice == 6) 
	{
        temp = num;
        for (; temp != 0; temp /= 10) 
		{
            sum = sum + temp % 10;
        }
        printf("Sum of digits = %d\n", sum);
    }

    else 
	{
        printf("Invalid choice!\n");
    }
}
