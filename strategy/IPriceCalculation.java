
package strategy;

import objects.Client;
import objects.Country;

public interface IPriceCalculation
{
	float calculateDiscount(float basePrice, Client client);
	
	float calculateMargin(float basePrice, Country country);
	
	float calculateTax(float basePrice, Country country);
	
	
}
