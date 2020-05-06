package example_inheritance;

public class Child extends Parent {
	int x =20;
	 void Method() {
		System.out.println("child x = " +x);
		System.out.println("this x = "+this.x); //child 자신의 멤버x 를 가르키는 참조변 this.x
		System.out.println("super x = "+super.x); //super.x parent 의 멤버 x
		
		
	}
}
