package pl.kriss3.class2.homelab;

public class Round 
{
	private int noOfRounds;
	
	public Round(int noOfRounds)
	{
		setNoOfRounds(noOfRounds);
	}
	
	public int getNoOfRounds()
	{
		return noOfRounds;
	}
	
	public void setNoOfRounds(int value)
	{
		if(value > 0)
			this.noOfRounds = value;
		else
			this.noOfRounds = 5;
	}
}
