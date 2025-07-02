#include <stdio.h>

float calculateSellingPrice(float costPrice) 
{
    float discount = 0.0;
    float sellingPrice;

    if (costPrice > 2000) 
	{
        discount = 15;
    } 
	else 
	{
        if (costPrice > 1000) 
		{
            discount = 10;
        } 
		else 
		{
            if (costPrice < 500) 
			{
                discount = 0;
            } 
			else
			{
                discount = 5;
            }
        }
    }

    sellingPrice = costPrice - (costPrice * discount / 100);

    printf("Discount Applied: %.2f%%\n", discount);
    return sellingPrice;
}

void main() 
{
    float costPrice, sellingPrice;

    printf("Enter Cost Price of the book: ");
    scanf("%f", &costPrice);

    sellingPrice = calculateSellingPrice(costPrice);

    printf("Selling Price of the book: %.2f\n", sellingPrice);
}
