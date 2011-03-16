
package strategy;

import objects.Service;

public class StrategyService extends Service
{
	protected IPriceCalculation priceCalculation;
	
	public StrategyService(IPriceCalculation priceCalculation)
	{
		this.priceCalculation = priceCalculation;
	}
	
	public float getPrice()
	{
		float price = this.basePrice;
		price += priceCalculation.calculateMargin(this.basePrice, this.country);
		price += priceCalculation.calculateDiscount(price, this.client);
		price += priceCalculation.calculateTax(price, this.country);
		
		return price;
	}
	
	
}
