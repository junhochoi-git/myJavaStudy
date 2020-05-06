package example_oop_polymorphism;

public class BindingTest3 {
	//~생략
	public static void main(String[] args) {
		
	}
}
class Parent3{
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child3 extends Parent3{
	int x= 200;
	void method() {
		System.out.println("x="+ x );
		System.out.println("super.x="+super.x ); // 부모클래스의 int x 
		System.out.println("this.x="+this.x ); // child 클래스의 int x;
		
	}
}