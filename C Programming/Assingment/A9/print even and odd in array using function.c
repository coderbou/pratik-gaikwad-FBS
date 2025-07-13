#include <stdio.h>
//void printEven(int,int);
//void printOdd(int,int);
void main() 
{
    int n;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Call functions
    printEven(arr, n);
    printOdd(arr, n);

    printf("\n");
}

// Function to print even numbers
void printEven(int arr[], int size) {
    printf("\nEven numbers in the array: ");
    for (int i = 0; i < size; i++) {
        if (arr[i] % 2 == 0) {
            printf("%d ", arr[i]);
        }
    }
}

// Function to print odd numbers
void printOdd(int arr[], int size) {
    printf("\nOdd numbers in the array: ");
    for (int i = 0; i < size; i++) {
        if (arr[i] % 2 != 0) {
            printf("%d ", arr[i]);
        }
    }
}
