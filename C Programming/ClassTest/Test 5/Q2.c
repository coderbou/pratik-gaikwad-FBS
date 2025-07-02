#include <stdio.h>

float updateBalance(float balance, int choice, float amount) 
{
    if (choice == 1) 
	{
        balance = balance + amount;
        printf("Amount deposited successfully.\n");
    } 
	else if (choice == 2) 
	{
        if (balance < 3000) 
		{
            printf("Cannot withdraw amount. Balance is less than 3000.\n");
        } 
		else if (amount > balance) 
		{
            printf("Cannot withdraw amount. Not enough balance.\n");
        } 
		else 
		{
            balance = balance - amount;
            printf("Amount withdrawn successfully.\n");
        }
    } 
	else 
	{
        printf("Invalid choice.\n");
    }

    return balance;
}

void main() 
{
    float balance, amount;
    int choice;

    printf("Enter your initial balance: ");
    scanf("%f", &balance);

    do {
        printf("\nCurrent Balance: %.2f\n", balance);
        printf("Enter your choice (1 for Deposit, 2 for Withdraw, 3 to Exit): ");
        scanf("%d", &choice);

        if (choice == 1 || choice == 2) 
		{
            printf("Enter amount: ");
            scanf("%f", &amount);
            balance = updateBalance(balance, choice, amount);
        } else if (choice == 3) 
		{
            printf("Exiting...\n");
        } 
		else 
		{
            printf("Invalid choice. Try again.\n");
        }

    } while (choice != 3);

    printf("Final Balance: %.2f\n", balance);
}
