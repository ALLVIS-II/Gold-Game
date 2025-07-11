package Game;

import Game.Card.Suit;

public class FaceCard extends Card {

	private int faceValue;
	
	public FaceCard(int faceValue, Suit suit)
	{
		super(suit);
		
		this.faceValue = faceValue;
	}
}
