package example.ch8.exceptionhandling;

public class ExceptionExUnchecked {
	public static void main(String[] args) {
		throw new RuntimeException();
		/*
		 * Exception in thread "main" java.lang.RuntimeException
		at example.ch8.exceptionhandling.ExceptionExUnchecked.main(ExceptionExUnchecked.java:5)
		성공적으로 컴파일 되나, 실행 하면 RuntimeException 이 발생하여 비정상적 종료
		 */
	}
}
