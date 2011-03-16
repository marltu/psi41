
package objects;

import strategy.*;
import tm.*;

public class Application
{
	private java.util.Collection orders;
	
	private java.util.Collection services;
	
	public static void main(String [ ] args)
	{
		
		// strategy
		
		Order o = new StrategyOrder(new DefaultPriceCalculation());
		o.basePrice = (float) 100.0;
		o.client = new Client(true);
		o.countryFrom = new Country(false, (float) 0.18);
		o.countryTo = new Country(true, (float) 0.18);
		System.out.println(o.getPrice());
		
		Order o1 = new StrategyOrder(new LoyalPriceCalculation());
		o1.basePrice = (float) 100.0;
		o1.client = new Client(true);
		o1.countryFrom = new Country(false, (float) 0.18);
		o1.countryTo = new Country(true, (float) 0.18);
		System.out.println(o1.getPrice());
		
		// template method
		
		Order o2 = new TMOrderDefaultPrice();
		o2.basePrice = (float) 100.0;
		o2.client = new Client(true);
		o2.countryFrom = new Country(false, (float) 0.18);
		o2.countryTo = new Country(true, (float) 0.18);
		System.out.println(o2.getPrice());
		
		Order o3 = new TMOrderLoyalPrice();
		o3.basePrice = (float) 100.0;
		o3.client = new Client(true);
		o3.countryFrom = new Country(false, (float) 0.18);
		o3.countryTo = new Country(true, (float) 0.18);
		System.out.println(o3.getPrice());
	}
}
