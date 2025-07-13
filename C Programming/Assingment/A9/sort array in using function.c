#include <stdio.h>
void main() {
    int n;

    printf("Enter size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements: ", n);
    acceptArray(arr, n);

    bubbleSort(arr, n);

    printf("\nSorted array in ascending order: ");
    displayArray(arr, n);
}
void acceptArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
}

void bubbleSort(int arr[], int n) {
    int temp;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

