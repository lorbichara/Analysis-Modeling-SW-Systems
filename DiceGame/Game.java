//Lorraine
//Dice Game - AMSS
//Class Game

public class Game {

	//Atributes
	private Dice dice1 = new Dice();
	private Dice dice2 = new Dice();

	//Method that plays the game and obtains result.
	public void play() {

		//The dice call the method throwDice() from the class Dice to obtain a value.
		dice1.throwDice();
		dice2.throwDice();

		//The faceValue of each dice is displayed as well as the sum of both dice.
		System.out.println("Dice 1: " + dice1.getFaceValue());
		System.out.println("Dice 2: " + dice2.getFaceValue());

		System.out.println("The sum of the dice is: " + sum());

		//If the sum of both dice is 7, the player wins.
		if(sum() == 7)
			System.out.println("You win!");
			
		else
			System.out.println("You lose!");
	}

	//Method that calculates the sum of both dice.
	public int sum() {
		return dice1.getFaceValue() + dice2.getFaceValue();
	}
}