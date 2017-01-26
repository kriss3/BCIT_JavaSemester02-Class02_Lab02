package pl.kriss3.class2.homelab;

public class Rules 
{	
	public Rules(){}
	
	public boolean validateRules(Dice d)
	{
		boolean result = false;
		if(d.roll() != 0)
		{
			result  = true;
		}
		return result;
	}
}
