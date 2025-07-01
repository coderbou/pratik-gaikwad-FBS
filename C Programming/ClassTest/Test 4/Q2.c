#include<stdio.h>

void main()
{
    int base, exponent;
    int res= 1;

    printf("Enter the base number: ");
    scanf("%d", &base);

    printf("Enter the exponent : ");
    scanf("%d", &exponent);

    for (int i = 1; i <= exponent; i++)
    {
        res = res * base;
    }

    printf("%d ^ %d = %d\n", base, exponent, res);
}
