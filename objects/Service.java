
package objects;

public abstract class Service
{
	protected Client client;
	
	protected Country country;
	
	protected float basePrice;
	
	public abstract float getPrice();
	
	
}
