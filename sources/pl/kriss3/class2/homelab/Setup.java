package pl.kriss3.class2.homelab;

import java.util.ArrayList;

/**
 * Setup class will set Players, Dice and Round
 * @author kszczurowski
 *
 */
public class Setup 
{
	//below will come from Scaner.in
	//setup Players
	private ArrayList<Player> ps;
	
	//Setup Die/Dies
	private Dice d;
	
	//Setup Rounds
	private Round round;

	public Setup()
	{
		this.ps = new ArrayList<Player>(){{
			add(new Player("John", "Winner"));
			add(new Player("James", "Lost"));
		}};
		
		d = new Dice(6);
		
		round = new Round(1);
	}
	
	public ArrayList<Player> getPlayers()
	{
		return ps;
	}
	
	public void setPlayer(Player value)
	{
		if(value != null)
			ps.add(value);
	}
	
	public Dice getDice()
	{
		return d;
	}
	
	public void setDice(Dice value)
	{
		if(value != null)
		{
			d=value;
		}
	}
	
	public Round getRound()
	{
		return round;
	}
	
	public void setRound(Round value)
	{
		if(value != null)
			round = value;
	}
}
