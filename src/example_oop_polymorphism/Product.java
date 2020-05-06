package example_oop_polymorphism;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint =(int)(price/10.0);
	}

}
//~CHILDREN
class Tv extends Product{
	Tv(){super(100);}
	//Object Ŭ������ toString()�� �������̵� �Ѵ�
	public String toString() {return "TV";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}

