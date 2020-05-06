package example_oop;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);
	}
	Car(Car c){
		color=c.color;
		gearType=c.gearType;
		door=c.door;
		// Car(Car c){ this(c.color, c.gearType, c.door);}
	}
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}

public class CarConstructorCopyTest {
	public static void main(String[] args) {
		
		Car c1= new Car(); // default Constructor c1 인스턴스의 멤버들은, white auto 4	
		Car c2 = new Car(c1); // c2 의 인스턴스 멤버들에 c1의 인스턴스 멤버들 복사 독립적으로 메모리공간에 존재. c1의 값이 변경되어도 c2 영향 ;
			
	}
}
