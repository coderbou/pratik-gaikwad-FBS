#include <stdio.h>
void opreation();
void main()
{
	opreation();
}
void opreation()
{
    int a, b;
    char op;

    printf("Enter the first number: ");
    scanf("%d", &a);

    printf("Enter the second number: ");
    scanf("%d", &b);

    printf("Enter an operator (+, -, *, /, %%): ");
    scanf(" %c", &op); 

    if (op == '+')
    {
        printf("Addition: %d\n", a + b);
    }
    else if (op == '-')
    {
        printf("Subtraction: %d\n", a - b);
    }
    else if (op == '*')
    {
        printf("Multiplication: %d\n", a * b);
    }
    else if (op == '/')
    {
        if (b != 0)
            printf("Division: %d\n", a / b);
        else
            printf("Error: Division by zero is not allowed.\n");
    }
    else if (op == '%')
    {
        if (b != 0)
            printf("Modulo: %d\n", a % b);
        else
            printf("Error: Modulo by zero is not allowed.\n");
    }
    else
    {
        printf("Invalid operator.\n");
    }
}
