#include <stdio.h>

void main() 
{
    int num, rev = 0, temp, digit;

    printf("Enter a 3-digit number: ");
    scanf("%d", &num);

    temp = num;

    if (num >= 100 && num <= 999) {
        digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;

        digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;

        digit = num % 10;
        rev = rev * 10 + digit;

        if (rev == temp) {
            printf("Palindrome number\n");
        } else {
            printf("Not a palindrome\n");
        }
    } else {
        printf("Not a 3-digit number\n");
    }

}
