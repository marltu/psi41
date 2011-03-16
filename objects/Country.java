
package objects;

public class Country
{
	private boolean europeanUnion = false;
	private float VAT = (float) 0.0;
	
	public Country(boolean europeanUnion, float VAT) {
		this.europeanUnion = europeanUnion;
		this.VAT = VAT;
	}
	
	public boolean isEuropeanUnion()
	{
		return this.europeanUnion;
	}
	
	public float getVAT()
	{
		return this.VAT;
	}
	
	
}
