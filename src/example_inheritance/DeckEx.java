package example_inheritance;

public class DeckEx {
	final int CARD_NUM =52;// »ó¼öÈ­
	Card cardArr[] = new Card[CARD_NUM];
	
	DeckEx() {
		int i =0; 
		for( int k = Card.KIND_MAX; k>0; k--) {
			for( int n =0; n< Card.NUM_MAX; n++) {
				cardArr[i++]=new Card(k, n+1);
				
			}
		}
	}
	Card pick( int idx) {
		return cardArr[idx%CARD_NUM];
	}
	
	Card pick() {
		int idx= (int)(Math.random() * CARD_NUM);
		return pick(idx);
	}
	
	void shuffle() {
		for( int i =0; i< cardArr.length; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r]= temp;
		}
	}
	
}
