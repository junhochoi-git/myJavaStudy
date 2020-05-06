package example_oop_polymorphism;
//매개변수의 다형성 예제

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		System.out.println("잔액:"+b.money+"원");
		System.out.println("현재 보너스포인트:"+b.bonusPoint+"점");
		
	}
}
