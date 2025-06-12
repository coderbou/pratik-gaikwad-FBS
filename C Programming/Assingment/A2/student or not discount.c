#include <stdio.h>

void main() {
    float price, discount = 0, final_price;
    char student;

    // Accepting input from the user
    printf("Enter the purchase amount: ");
    scanf("%f", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);  // space before %c to consume any leftover newline character

    // Applying conditions using if-else only
    if (student == 'y' || student == 'Y') {
        if (price > 500) {
            discount = 0.20 * price;
        } else {
            discount = 0.10 * price;
        }
    } else {
        if (price > 600) {
            discount = 0.15 * price;
        } else {
            discount = 0.0;
        }
    }

    final_price = price - discount;

    // Output
    printf("Discount: %.2f\n", discount);
    printf("Final price to be paid: %.2f\n", final_price);

}
