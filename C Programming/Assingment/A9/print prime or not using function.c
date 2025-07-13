#include <stdio.h>

void main() {
    int n, i;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printPrimes(arr, n);
}
// Function to check if a number is prime
int isPrime(int no) {
    int j;

    if (no <= 1) {
        return 1;
    }

    for (j = 2; j < no; j++) {
        if (no % j == 0) {
            return 0; 
        }
    }

    return 1;  
}

// Function to print prime numbers in the array
void printPrimes(int arr[], int n) {
    int i;
    printf("\nPrime numbers in the array: ");
    for (i = 0; i < n; i++) {
        if (isPrime(arr[i])) {
            printf("%d ", arr[i]);
        }
    }
    printf("\n");
}
