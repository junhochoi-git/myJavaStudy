package example_inheritance;

public class Child extends Parent {
	int x =20;
	 void Method() {
		System.out.println("child x = " +x);
		System.out.println("this x = "+this.x); //child �ڽ��� ���x �� ����Ű�� ������ this.x
		System.out.println("super x = "+super.x); //super.x parent �� ��� x
		
		
	}
}
