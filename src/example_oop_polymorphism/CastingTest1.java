package example_oop_polymorphism;
//import example_oop_polymorphism.Car;
//import example_oop_polymorphism.FireEngine;



public class CastingTest1 {
	public static void main(String[] args) {
		Car car= null;
		
		FireEngine fe= new FireEngine();
		FireEngine fe2= null; 
		
		fe.water(); // Water!!!
		
		car = fe; //Car car= new FireEngine(); // 조상 클래스 매개변수 new 후손클래스 자동 형변환
		//car.water(); water 는 fireEngine 클래스의 인스턴스 메소드로, car 는 조상 클래스 이므로 xx
		
		
		fe2 = (FireEngine)car;
		fe2.water();
		
		
		
	}
	
}
