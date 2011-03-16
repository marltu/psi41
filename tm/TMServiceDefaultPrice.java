
package tm;

import objects.Country;
import objects.Client;

public class TMServiceDefaultPrice extends TMService
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
