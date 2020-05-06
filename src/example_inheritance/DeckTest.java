package example_inheritance;

//import example_inheritance.DeckEx;
//import example_inheritance.Card;

public class DeckTest {
	public static void main(String[] args) {
		DeckEx d = new DeckEx();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shuffle();
		c= d.pick(0);
		System.out.println(c);
		
	}
}
