package example_exception;

public class ExceptionEx7 {
	public static void main(String args[]	) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		}catch(ArithmeticException ae){
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
		}//try-catch �� ArithmeticException �� ������ ��� ���ܰ�  �� catch ��Ͽ���ó����.
	
		System.out.println(6);
	}
}
