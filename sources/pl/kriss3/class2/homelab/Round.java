package pl.kriss3.class2.homelab;

public class Round 
{
	private int noOfRounds;
	
	public Round(int noOfRounds)
	{
		this.noOfRounds  = noOfRounds;
	}
	
	public int getNoOfRounds()
	{
		return noOfRounds;
	}
	
	public void setNoOfRounds(int value)
	{
		this.noOfRounds = value < 0 || value > 6 ? 6 : value;
	}
}
