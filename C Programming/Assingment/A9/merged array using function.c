#include <stdio.h>
void main() {
    int n1, n2;

    printf("Enter size of first array: ");
    scanf("%d", &n1);
    int arr1[n1];

    printf("Enter %d elements for first array: ", n1);
    acceptArray(arr1, n1);

    printf("Enter size of second array: ");
    scanf("%d", &n2);
    int arr2[n2];

    printf("Enter %d elements for second array: ", n2);
    acceptArray(arr2, n2);

    int merged[n1 + n2];
    mergeArrays(arr1, n1, arr2, n2, merged);

    printf("\nMerged array: ");
    displayArray(merged, n1 + n2);
}
// Function to accept array elements
void acceptArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
}

// Function to merge two arrays into merged[]
void mergeArrays(int arr1[], int n1, int arr2[], int n2, int merged[]) {
    for (int i = 0; i < n1; i++) {
        merged[i] = arr1[i];
    }
    for (int i = 0; i < n2; i++) {
        merged[n1 + i] = arr2[i];
    }
}

// Function to display an array
void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}