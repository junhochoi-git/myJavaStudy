package example_oop_interface;

class Parent{
	public void method2() {
		System.out.println("method2() in Parent class");
	}
}

interface MyInterFace{
	default void method1() {
		System.out.println("method1() in MyInterface1");
	}
	default void method2(){
		System.out.println("method2()in MyInterfce1");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface1");
	}
}
interface MyInterFace2{
	
	default void method1() {
		System.out.println("method1() in MyInterFace2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterFace2");
	}
	
}
class Child extends Parent implements MyInterFace ,MyInterFace2 {
	public void method1() {
		System.out.println("method1() in Child"); //overriding
	}
	
}

public class DefaultMethodTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1(); //child
		c.method2(); //Myinterface //parent class
		MyInterFace.staticMethod();
		MyInterFace2.staticMethod();
	}
}
