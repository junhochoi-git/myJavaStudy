package example.ch8.exceptionhandling;

public class ExceptionExFinally {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			//deleteFiles();
		}catch(Exception e) {
			e.printStackTrace();
			//deleteFiles();
		}//finally{}
		//deleteFiles �� ���ܰ� �߻��ϵ� ���ϵ� ����Ǿ�� �ϹǷ� �̷��� finally ���� ����ϸ� ����.
		finally {
			deleteFiles();
		}
	}
	static void startInstall() {/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 �ۼ�*/}
	static void copyFiles() {/* ���ϵ��� �����ϴ� �ڵ带 �ۼ�*/}
	static void deleteFiles() {/* �ӽ����ϵ��� �����ϴ� �ڵ带 �ۼ�*/}
}
