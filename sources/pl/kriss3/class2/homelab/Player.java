package pl.kriss3.class2.homelab;

/**
 * Player class to represent a player;
 * @author krzysztof szczurowski
 * @since 2017-01-20
 */
public class Player 
{
	private String fName;
	private String lName;
	private boolean isStanding;
	private int playerScore;
	
	public Player(String fName, String lName)
	{
		this.fName = fName;
		this.lName = lName;
		this.playerScore = 0;
		setState(true);
	}
	
	public String getFirstName()
	{
		return this.fName;
	}
	
	public void setFirstName(String value)
	{
		this.fName = value.equals("") || value == null ? "John" : value;
	}
	
	public boolean getPlayerState()
	{
		return this.isStanding;
	}
	
	public void setState(boolean value)
	{
		this.isStanding = value;
	}
	
	public int getPlayerScore()
	{
		return this.playerScore;
	}
	
	public void setPlayerScore(int value)
	{
		this.playerScore = value;
	}
	
	public String toString()
	{
		return String.format("%s %s", fName, lName);
	}
}
