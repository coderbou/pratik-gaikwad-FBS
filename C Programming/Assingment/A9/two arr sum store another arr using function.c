#include <stdio.h>
void main() {
    int n;

    printf("Enter size of the arrays: ");
    scanf("%d", &n);

    int arr1[n], arr2[n], sum[n];

    printf("Enter %d elements for first array: ", n);
    acceptArray(arr1, n);

    printf("Enter %d elements for second array: ", n);
    acceptArray(arr2, n);

    addArrays(arr1, arr2, sum, n);

    printf("\nSum stored in third array: ");
    displayArray(sum, n);
}
// Function to accept array elements
void acceptArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
}

// Function to add two arrays and store in sum[]
void addArrays(int arr1[], int arr2[], int sum[], int n) {
    for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
    }
}

// Function to display an array
void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

