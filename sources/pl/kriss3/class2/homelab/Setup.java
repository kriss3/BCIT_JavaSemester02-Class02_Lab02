package pl.kriss3.class2.homelab;

import java.util.Arrays;

public class Setup 
{
	//below will come from Scaner.in
	//setup Players
	private int noOfPlayers = 1;
	private Player p1 = new Player("John", "Doe");
	private Player[] ps = new Player[noOfPlayers];
	
	
	//Setup Die/Dies
	private int noOfDice = 1;
	private Dice d1 = new Dice(6);
	private Dice[] diesSet = new Dice[noOfDice];
	
	
	//Setup Rounds
	private int rounds = 1;
	
	
	public Setup()
	{
		
	}
}
