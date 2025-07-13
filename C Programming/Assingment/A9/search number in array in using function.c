#include <stdio.h>

void main() 
{
    int n, key;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter number to search: ");
    scanf("%d", &key);

    // Call the function
    searchNumber(arr, n, key);
}
// Function to search the given number and print result
void searchNumber(int arr[], int size, int key) {
    int found = 0;

    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            printf("Number %d found at position %d.\n", key, i + 1);
            found = 1;
            break; // stop at first occurrence
        }
    }

    if (!found) {
        printf("Number %d not found in the array.\n", key);
    }
}
