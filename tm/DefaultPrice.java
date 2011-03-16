package tm;

import objects.Client;
import objects.Country;

public class DefaultPrice {
	public float calculateMargin(float basePrice, Country country)
	{
		return basePrice * (float) 0.3;
	}
	
	public float calculateDiscount(float basePrice, Client client)
	{
		return 0;
	}
	
	public float calculateTax(float basePrice, Country country)
	{
		return basePrice * country.getVAT();
	}
}
