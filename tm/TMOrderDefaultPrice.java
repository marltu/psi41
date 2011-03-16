
package tm;

import objects.Client;
import objects.Country;

public class TMOrderDefaultPrice extends TMOrder
{
	protected float calculateDiscount(float basePrice, Client client)
	{
		return basePrice * (float) 0.3;
	}
	
	protected float calculateTax(float basePrice, Country country)
	{
		return 0;
	}
	
	protected float calculateMargin(float basePrice, Country country)
	{
		return basePrice * country.getVAT();
	}
	
	
}
