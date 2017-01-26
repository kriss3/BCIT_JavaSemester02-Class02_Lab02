package pl.kriss3.class2.homelab;

public class Player 
{
	private String fName;
	private String lName;
	private boolean isStanding;
	
	public Player(String fName, String lName)
	{
		this.fName = fName;
		this.lName = lName;
		setState(true);
	}
	
	public void setState(boolean value)
	{
		this.isStanding = value;
	}
	
	public String toString()
	{
		return String.format("%s %s", fName, lName);
	}
	
}
