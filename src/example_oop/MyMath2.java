package example_oop;

public class MyMath2 {
	long a,b ;  
	
	long add() { // �ν��Ͻ��޼���
		return a+b; //(iv) class ��� ���� long a,b
		
	}
	static long add(long a, long b)	{ // Ŭ�����޼ҵ� static �޼ҵ�
		return a+b; // local variables Ŭ�����޼ҵ�� �ν��Ͻ� �޼ҵ带 ����Ҽ� ����
	}
	
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200l, 100l));
		MyMath2 mm = new MyMath2();
		mm.a=200l;
		mm.b=103l;
		
		System.out.println(mm.add());
		
	}
}
