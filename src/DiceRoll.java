/**
 * 
 * Erin Bevec
 *
 */

public class DiceRoll 
{
	private int numRolls;
	
	public DiceRoll() 
	{
		numRolls = 0;
	}
	
	public int roll()
	{
		numRolls++;
		return (int)(Math.random()*6) + 1;
		
	}
	
	public void reset()
	{
		numRolls = 0;
	}
	
	public int getNumRolls()
	{
		return numRolls;
	}
			

		
		
	}
