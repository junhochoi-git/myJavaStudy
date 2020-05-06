package example_oop;

import example_oop.MyMath3;

public class OverloadingTest {
	public static void main(String[] args) {
		//~ Mymath class 로부터 인스턴스 생성
		MyMath3 mm = new MyMath3();
		
		System.out.println("mm.add(3,3) 결과  = "+mm.add(3,3));
		
	}
}
