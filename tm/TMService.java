
package tm;

import objects.Service;
import objects.Country;
import objects.Client;

public abstract class TMService extends Service
{
	protected abstract float calculateTax(float basePrice, Country country);
	
	protected abstract float calculateMargin(float basePrice, Country country);
	
	protected abstract float calculateDiscount(float basePrice, Client client);
	
	public final float getPrice()
	{
		float price = this.basePrice;
		price += calculateMargin(this.basePrice, this.country);
		price += calculateDiscount(price, this.client);
		price += calculateTax(price, this.country);
		
		return price;
	}
	
	
}
