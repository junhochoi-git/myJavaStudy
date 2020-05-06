package example.ch8.exceptionhandling;

public class ExceptionExFInallyTest2 {
	public static void main(String[] args) {
		//method1() �� static �޼ҵ��̹Ƿ� �ν��Ͻ� �������� ���� ȣ���� �����ϴ�.
		ExceptionExFInallyTest2.method1();
		System.out.println("method1() ���� ��ġ�� main �޼ҵ�� ���ƿԽ��ϴ�.");
	}
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return; // ���� �������� �޼ҵ带 �����Ѵ�.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1() �� finally ���� ����Ǿ����ϴ�.");
			//try ������ return ���� ����Ǵ� ��쿡�� finally ������� ���� ����� �Ŀ� ���� �������� �޼ҵ带 ������.
		}
	}
}
