
package objects;

public abstract class Order
{
	protected Country countryFrom;
	
	protected Country countryTo;
	
	protected Client client;
	
	protected float basePrice;
	
	public abstract float getPrice();
	
	
}
