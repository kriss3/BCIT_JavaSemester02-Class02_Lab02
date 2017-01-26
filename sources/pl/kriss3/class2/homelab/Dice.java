package pl.kriss3.class2.homelab;

import java.util.Random;

public class Dice 
{
	private int maxDieValue;
	public Dice(int maxDieValue)
	{
		setNumberOfSides(maxDieValue);
	}

	public int getNumberOfSides()
	{
		return maxDieValue;
	}
	
	public void setNumberOfSides(int value)
	{
		this.maxDieValue = value;
	}
	
	public int roll()
	{
		Random rnd = new Random();
		return rnd.nextInt(maxDieValue) + 1;
	}
}
