package pl.kriss3.class2.homelab;

public class Game 
{
	private int totalScore;
	private int myRoundScore;
	private int d1;
	private int d2;
	private boolean didWeSkunked;
	
	public Game()
	{
	}
	
	//Play has access to all settings: Players, Dice, Round
	//And now the Engine
	public int Play(Setup s)
	{		
		for (int i = 1; i <= s.getRound().getNoOfRounds(); i ++) {
			while (didWeSkunked == false) 
			{
				d1 = s.getDice().roll();
				d2 = s.getDice().roll();
				
				System.out.println();
				System.out.println("Dice One is " + d1 + " and Dice Two is " + d2);
				
				myRoundScore = myRoundScore + (d1 + d2);
				
				if (d1 == 1 && d2 == 1) 
				{
					//Check each player's state and if any of them is sitting, zero out only the once where state is STANDING
					didWeSkunked = true;
					totalScore = 0;
					myRoundScore = 0;
					System.out.println("Well, no go anymore!");
					break;
				}
				
				System.out.println("Current score for round " + i + " is " + myRoundScore);
				
			}
			
			totalScore += myRoundScore;
			System.out.println("Your score after round " + i + " is " + myRoundScore + ".");
			didWeSkunked = false;
		}
		
		return totalScore;
		
	}
}
