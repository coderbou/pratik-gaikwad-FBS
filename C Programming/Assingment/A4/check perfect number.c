#include <stdio.h>

void main() 
{
    int no, i = 1, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &no);

    while (i < no) {
        if (no % i == 0)
            sum = sum + i;
        i++;
    }

    if (sum == no)
        printf("Perfect\n");
    else
        printf("Not Perfect\n");
}
