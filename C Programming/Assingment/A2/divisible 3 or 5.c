#include <stdio.h>

void main() 
{
    int num;

    // Accept number from user
    printf("Enter a number: ");
    scanf("%d", &num);

    // Check divisibility using if-else only
    if (num % 3 == 0 && num % 5 == 0) {
        printf("Divisible by both\n");
    } else if (num % 3 == 0) {
        printf("Divisible by 3 but not by 5\n");
    } else if (num % 5 == 0) {
        printf("Divisible by 5 but not by 3\n");
    } else {
        printf("Divisible by None\n");
    }
}
