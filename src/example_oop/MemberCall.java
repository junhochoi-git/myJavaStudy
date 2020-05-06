package example_oop;

public class MemberCall {
	//member
	int iv =10;
	static int cv = 20;
	
	int iv2=cv;
	//static int cv = iv; // Error 클래스 변수는 인스턴스 변수를 사용할수 없음.
	static int cv2 = new MemberCall().iv; //객체를 생성하고 참조함
	
	static void staticMethod1() { //클래스 메소드 staticMethod1
		System.out.println(cv);
		//System.out.println(iv); // Error 클래스 메소드에서 인스턴스 변수 사용불가
		MemberCall c= new MemberCall();
		System.out.println(c.iv); // 객체를 생성한 후에야 사용 가능
	}
	
	//인스턴스 메소드
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	//==============================
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); // 에러 클래스메소드에서는 인스턴스 메소드를 호출할수 없음
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스를 생성한 후에야 호출할수있음
		
	}
	void instanceMethod2() { //인스턴스메소드에서는 인스턴스메소드와 클래스 메소드
		staticMethod1();  	 //모두 인스턴스 생성없이 바로 호출이 가능
		instanceMethod1();
		
	}
	
	
	
	
}
