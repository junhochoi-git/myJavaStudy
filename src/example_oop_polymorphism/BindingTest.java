package example_oop_polymorphism;

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child(); // 조상 타입의 변수 p 
		Child c= new Child(); // 자손 타입의 c
		
		System.out.println("p.x= "+p.x); // Parent 클래스의 인스턴트 멤버 변수 x 
		p.method();
		
		System.out.println("c.x = "+c.x); 
		c.method();  
		
	}
}

 class Parent{
	int x =100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x =200;
	void method() {
		System.out.println("Child Method");
	}
}