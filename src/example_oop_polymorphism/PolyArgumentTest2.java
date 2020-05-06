package example_oop_polymorphism;

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		
		Buyer2 b= new Buyer2();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		
	}
	
}
