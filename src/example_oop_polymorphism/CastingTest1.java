package example_oop_polymorphism;
//import example_oop_polymorphism.Car;
//import example_oop_polymorphism.FireEngine;



public class CastingTest1 {
	public static void main(String[] args) {
		Car car= null;
		
		FireEngine fe= new FireEngine();
		FireEngine fe2= null; 
		
		fe.water(); // Water!!!
		
		car = fe; //Car car= new FireEngine(); // ���� Ŭ���� �Ű����� new �ļ�Ŭ���� �ڵ� ����ȯ
		//car.water(); water �� fireEngine Ŭ������ �ν��Ͻ� �޼ҵ��, car �� ���� Ŭ���� �̹Ƿ� xx
		
		
		fe2 = (FireEngine)car;
		fe2.water();
		
		
		
	}
	
}
