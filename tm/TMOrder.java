
package tm;

import objects.Order;
import objects.Client;
import objects.Country;

public abstract class TMOrder extends Order
{
	protected abstract float calculateDiscount(float basePrice, Client client);
	
	protected abstract float calculateTax(float basePrice, Country country);
	
	protected abstract float calculateMargin(float basePrice, Country country);
	
	public final float getPrice()
	{
		float price = this.basePrice;
		price += calculateMargin(price, this.countryTo);
		price += calculateDiscount(price, this.client);
		price += calculateTax(price, this.countryTo);
		
		return price;
	}
	
	
}
