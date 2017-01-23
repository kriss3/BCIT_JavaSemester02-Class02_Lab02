package pl.kriss3.class2.homelab;

public class Dice 
{
	private int numberOfSides;
	public Dice(int numberOfSides)
	{
		setNumberOfSides(numberOfSides);
	}

	public int getNumberOfSides()
	{
		return numberOfSides;
	}
	
	public void setNumberOfSides(int noOfSides)
	{
		this.numberOfSides = noOfSides;
	}
}
