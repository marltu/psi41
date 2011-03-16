
package tm;

import objects.Country;
import objects.Client;

public class TMServiceDefaultPrice extends TMService
{
	private DefaultPrice priceCalculation = new DefaultPrice();
	protected float calculateTax(float basePrice, Country country)
	{
		return priceCalculation.calculateTax(basePrice, country);
	}
	
	protected float calculateDiscount(float basePrice, Client client)
	{
		return priceCalculation.calculateDiscount(basePrice, client);
	}
	
	protected float calculateMargin(float basePrice, Country country)
	{
		return priceCalculation.calculateMargin(basePrice, country);
	}
}
