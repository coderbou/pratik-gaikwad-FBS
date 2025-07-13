#include <stdio.h>

void main() {
    int arr[5] = {5, 2, 9, 1, 7};
    int size = 5;

    printf("Array elements: ");
    for(int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Call the function
    findMinMax(arr, size);
}

// Function to find minimum and maximum
void findMinMax(int arr[], int size) {
    int min = arr[0];
    int max = arr[0];

    for(int i = 1; i < size; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
        if(arr[i] > max) {
            max = arr[i];
        }
    }

    printf("Minimum number in array: %d\n", min);
    printf("Maximum number in array: %d\n", max);
}
