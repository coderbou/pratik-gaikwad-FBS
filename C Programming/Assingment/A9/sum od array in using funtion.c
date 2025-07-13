#include <stdio.h>

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

    // Call the function
    findSum(arr, n);
}
// Function to calculate and print sum
void findSum(int arr[], int size) {
    int sum = 0;

    for (int i = 0; i < size; i++) {
        sum = sum + arr[i];
    }

    printf("Sum of all elements: %d\n", sum);
}
