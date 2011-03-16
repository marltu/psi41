
package tm;

import objects.Client;
import objects.Country;

public class TMOrderDefaultPrice extends TMOrder
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
