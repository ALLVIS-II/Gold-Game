package Game;

import java.util.Random;

import Game.Card.Suit;

/**
 * Deck class to handle class of 52 cards across 4 suits.
 * 
 * @author James W
 *
 */
public class Deck {

	static int cardCount = 0;
	
	Card[] deck;
	
	public Deck()
	{
		
		/**
		 * 
		 */
		deck = new Card[54];

		deck[52] = new JokerCard();
		deck[53] = new JokerCard();
		
		//starting index 0 which will be face value 1 (ace)
		//ACE (1), 2, 3, ... 10, JACK, QUEEN, KING
		for (int i = 0; i <= 12; i++)
		{
			deck[i] = new FaceCard(i + 1, Suit.DIAMOND);
			
			System.out.println(deck[i]);
			
			cardCount++;
		}
	}
	
	public boolean isJoker(Card c)
	{
		if (c instanceof JokerCard)
		{
			System.out.println("You got a joker card");
			return true;
		}
		else
		{
			System.out.println("You DID NOT get a joker card");
			return false;
		}
	}
	
}
