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
		}//try-catch 끝 ArithmeticException 를 제외한 모든 예외가  이 catch 블록에서처리됨.
	
		System.out.println(6);
	}
}
