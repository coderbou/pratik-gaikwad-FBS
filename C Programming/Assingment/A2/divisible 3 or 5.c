#include <stdio.h>

void main() 
{
    int no;
    printf("Enter a number: ");
    scanf("%d", &no);

    // Check divisibility using if-else only
    if (no % 3 == 0 && no % 5 == 0) {
        printf("Divisible by both\n");
    } else if (no % 3 == 0) {
        printf("Divisible by 3 but not by 5\n");
    } else if (no % 5 == 0) {
        printf("Divisible by 5 but not by 3\n");
    } else {
        printf("Divisible by None\n");
    }
}
