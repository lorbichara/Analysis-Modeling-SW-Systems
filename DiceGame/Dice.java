//Lorraine
//Dice Game - AMSS
//Class Dice

import java.util.Random; //Imports library that obtains random values

public class Dice {
	
	//Atribute
	private int faceValue;

	//Method that throws dice.
	public void throwDice() {

		//Generates random values from 1 to 6 and assigns them to faceValue.
		Random rand = new Random();
		faceValue = rand.nextInt((6 - 1) + 1) + 1;
	}

	//Method that returns the value of faceValue.
	public int getFaceValue() {
		return faceValue;
	}
}