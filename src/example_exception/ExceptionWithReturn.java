package example_exception;

public class ExceptionWithReturn {
	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e){
			System.out.println("main �޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�");
		}
	}
	static int method1() { //throws Exception
		try {
			System.out.println("method1 �� ȣ��Ǿ����ϴ�.");
			//throw new Exception();
			return 0; // ���� �������� �޼ҵ带 �����Ѵ�.
			
		}catch(Exception e){
			e.printStackTrace();
			return 1; // catch �� ������ return �� �ʿ�
		}finally {
			System.out.println("method1 �޼ҵ��� fianlly ���� ����Ǿ����ϴ�.");
		}
	}
}
