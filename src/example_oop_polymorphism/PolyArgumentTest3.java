package example_oop_polymorphism;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b3 = new Buyer3();
		
		Tv tv= new Tv();
		Computer comp= new Computer();
		Audio audio = new Audio();
		
		b3.buy(tv);
		b3.buy(comp);
		b3.buy(audio);
		
		b3.summary();
		System.out.println();
		b3.refund(comp);
		b3.summary();
		
		
	
	}
}
