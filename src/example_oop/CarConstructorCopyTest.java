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
		
		Car c1= new Car(); // default Constructor c1 �ν��Ͻ��� �������, white auto 4	
		Car c2 = new Car(c1); // c2 �� �ν��Ͻ� ����鿡 c1�� �ν��Ͻ� ����� ���� ���������� �޸𸮰����� ����. c1�� ���� ����Ǿ c2 ���� ;
			
	}
}
