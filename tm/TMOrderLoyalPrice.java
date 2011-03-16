
package tm;

import objects.Country;
import objects.Client;

public class TMOrderLoyalPrice extends TMOrder
{
	protected float calculateTax(float basePrice, Country country)
	{
		return basePrice * (float) 0.2;
	}
	
	protected float calculateDiscount(float basePrice, Client client)
	{
		if (client.isLoyal()) {
			return (float) - 0.1 * basePrice;
		} else {
			return 0;
		}
	}
	
	protected float calculateMargin(float basePrice, Country country)
	{
		return country.getVAT() * basePrice;
	}
	
	
}
