package Game;

import java.util.Objects;

public class Card {

	enum Suit { HEART, DIAMOND, CLUB, SPADE, JOKER };

	private Suit suit; //0 = HEARTS, 1 = DIAMONDS

	
	public Card(Suit suit)
	{
		this.suit = suit;
	}
	
	
	public Suit getSuit() {
		return suit;
	}
	
	/*
	public int getFaceValue()
	{
		return faceValue;
	}
	
	@Override
	public String toString()
	{
		return suit + " " + faceValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(faceValue, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return this.faceValue == other.faceValue && this.suit == other.suit;
	}
	*/
}
