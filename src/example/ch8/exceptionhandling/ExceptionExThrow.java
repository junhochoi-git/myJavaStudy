package example.ch8.exceptionhandling;

public class ExceptionExThrow {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���� �߻�");
			throw e;
			// throw new Exception("���� �߻�"); // ���� ������ ���ٷ�.
		}catch(Exception e) {
			System.out.println("���� �޽��� :"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
}
