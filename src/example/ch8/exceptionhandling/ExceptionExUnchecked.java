package example.ch8.exceptionhandling;

public class ExceptionExUnchecked {
	public static void main(String[] args) {
		throw new RuntimeException();
		/*
		 * Exception in thread "main" java.lang.RuntimeException
		at example.ch8.exceptionhandling.ExceptionExUnchecked.main(ExceptionExUnchecked.java:5)
		���������� ������ �ǳ�, ���� �ϸ� RuntimeException �� �߻��Ͽ� �������� ����
		 */
	}
}
