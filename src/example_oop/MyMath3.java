package example_oop;

//add(){} 메소드 오버로딩 테스트

public class MyMath3 {
	int add(int a , int b) {
		System.out.println("int add("+a+"+"+b+") = ");
		return a+b;
	}
	long add(int a , long b) {
		System.out.println("long add("+a+"+"+b+") = ");
		return a+b;
	}
	long add(long a , int b) {
		System.out.println("long add("+a+"+"+b+") = ");
		return a+b;
	}
	long add(long a , long b) {
		System.out.println("long add("+a+"+"+b+") = ");
		return a+b;
	}
	int add(int[] a) {
		System.out.println("int add(int[]) "+a);
		int result=0;
		for(int i : a) {
			result+=i;
		}
		return result;
	}
	
}
