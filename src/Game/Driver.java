package Game;

import java.util.Random;

import Game.Card.Suit;

public class Driver {
	
	
	
	
	public static void main(String[] args) {
		

		//Math.random() * 52
		Random r = new Random(36352);
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		
		int x = 6;
		float f = (float)5.3; //32bits 64
		
		
		
		
		// 6 * 3
		// 7 / 2.3
		
		
		/*
		Card testCard = new Card(5, Suit.DIAMOND);
		
		System.out.println(testCard.getFaceValue());
		System.out.println(testCard.getSuit());
		
		System.out.println(testCard);
		
		
		Card testCard2 = new Card(7, Suit.SPADE);
		System.out.println(testCard2);
		*/

		
		//System.out.println(d1.deck[4] == d1.deck[4]);
		
/*
		Card testCard = new Card(5, Suit.DIAMOND);
		System.out.println(testCard);
		System.out.println(d1.deck[4]);
		System.out.println(d1.deck[4] == testCard);
		
		FaceCard fc = new FaceCard(5, Suit.DIAMOND);
		JokerCard jc = new JokerCard();
		
		System.out.println(fc.getSuit());
		System.out.println(jc.getSuit());
		*/
		


		//Deck d1 = new Deck();

		//System.out.println(d1.isJoker(d1.deck[0]));
		//System.out.println(d1.isJoker(d1.deck[53]));
		
	}

}
