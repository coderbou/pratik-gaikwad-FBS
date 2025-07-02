#include <stdio.h>

// Function to calculate selling price
float calculateSellingPrice(float costPrice, float discount) 
{
	float sellingPrice;

	if (discount >= 0) 
	{
		if (discount <= 100) 
		{
			sellingPrice = costPrice - (costPrice * discount / 100);
		} 
		else 
		{
			printf("Invalid discount! More than 100%%.\n");
			sellingPrice = costPrice;  // No discount applied
		}
	} 
	else 
	{
		printf("Invalid discount! Negative value.\n");
		sellingPrice = costPrice;  // No discount applied
	}

	return sellingPrice;
}

void main() 
{
	float costPrice, discount, sellingPrice;

	printf("Enter the cost price of the book: ");
	scanf("%f", &costPrice);

	printf("Enter the discount percentage: ");
	scanf("%f", &discount);

	sellingPrice = calculateSellingPrice(costPrice, discount);

	printf("Selling Price of the book = %.2f\n", sellingPrice);
}
