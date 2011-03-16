
package strategy;

import objects.Country;
import objects.Client;

public class LoyalPriceCalculation implements IPriceCalculation
{
	public float calculateMargin(float basePrice, Country country)
	{
		return basePrice * (float) 0.2;
	}
	
	public float calculateDiscount(float basePrice, Client client)
	{
		if (client.isLoyal()) {
			return (float) - 0.1 * basePrice;
		} else {
			return 0;
		}
	}
	
	public float calculateTax(float basePrice, Country country)
	{
		return country.getVAT() * basePrice;
	}
	
	
}
