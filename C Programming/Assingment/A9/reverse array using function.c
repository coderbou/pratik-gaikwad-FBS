#include <stdio.h>
void main() {
    int n;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    acceptArray(arr, n);

    printf("\nOriginal array: ");
    displayArray(arr, n);

    printf("Reversed array: ");
    displayReversed(arr, n);
}
// Function to accept array elements
void acceptArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
}

// Function to display array elements in original order
void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Function to display array elements in reverse order
void displayReversed(int arr[], int n) {
    for (int i = n - 1; i >= 0; i--) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

