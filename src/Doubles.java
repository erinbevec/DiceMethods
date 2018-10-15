
public class Doubles {

	public static void main(String[] args) 
	{
		DiceRoll rolling = new DiceRoll();
		int die1 = rolling.roll();
		int die2 = rolling.roll();
		int rollCount = rolling.getNumRolls();
		boolean play = true;
		while (play == true) 
		{
			die1 = rolling.roll();
			System.out.println("Your first roll is " + die1);
			die2 = rolling.roll();
			int sum = die1 + die2;
			System.out.println("Your second roll is " + die2);
			System.out.println("The sum of the rolls is " + sum);
			
			if (die1 == die2)
				{
					play = false;
					System.out.println("You rolled a double!");
					System.out.println("You rolled two  " + die1 + "'s");
					System.out.println("It took you " + rollCount + " rolls to get a double.");
				}
			else 
			{
				play = true;
			}
			
		}
		
	}

}
