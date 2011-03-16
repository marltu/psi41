
package strategy;

import objects.Order;

public class StrategyOrder extends Order
{
	protected IPriceCalculation priceCalculation;
	
	public StrategyOrder(IPriceCalculation priceCalculation)
	{
		this.priceCalculation = priceCalculation;
	}
	
	public float getPrice()
	{
		float price = this.basePrice;
		price += priceCalculation.calculateMargin(price, this.countryTo);
		price += priceCalculation.calculateDiscount(price, this.client);
		price += priceCalculation.calculateTax(price, this.countryTo);
		
		return price;
	}
	
	
}
