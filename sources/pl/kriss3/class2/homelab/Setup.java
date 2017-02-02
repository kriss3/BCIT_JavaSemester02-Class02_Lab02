package pl.kriss3.class2.homelab;

import java.util.ArrayList;

/**
 * Setup class will set Players, Dice and Round
 * @author krzysztof szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class02_Lab02.git
 */
public class Setup 
{
	//below will come from Scaner.in
	//setup Players
	private ArrayList<Player> allPlayers;
	
	//Setup Rounds
	private Round round;

	public Setup()
	{
		this.allPlayers = new ArrayList<Player>(){{
			add(new Player("John", "Winner"));
			add(new Player("James", "Lost"));
		}};
		
		setRound(new Round(1));
	}
	
	public ArrayList<Player> getPlayers()
	{
		return allPlayers;
	}
	
	public void setPlayer(Player value)
	{
		if(value != null)
			allPlayers.add(value);
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
