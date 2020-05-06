package example_oop;

public class MyMath2 {
	long a,b ;  
	
	long add() { // 인스턴스메서드
		return a+b; //(iv) class 멤버 변수 long a,b
		
	}
	static long add(long a, long b)	{ // 클래스메소드 static 메소드
		return a+b; // local variables 클래스메소드는 인스턴스 메소드를 사용할수 없음
	}
	
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200l, 100l));
		MyMath2 mm = new MyMath2();
		mm.a=200l;
		mm.b=103l;
		
		System.out.println(mm.add());
		
	}
}
