package example.ch8.exceptionhandling;

public class NewExceptionTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException se) {
			System.out.println("���� �޽��� : "+se.getMessage());
			se.printStackTrace();
			System.out.println("��ġ ������ Ȯ���� �Ŀ� �ٽ� ��ġ���ֽʽÿ�.");
		}catch(MemoryException me) {
			System.out.println("�����޽��� : "+me.getMessage());
			me.printStackTrace();
			System.gc(); // Garbage Colletction �� �����Ͽ� �޸𸮸� �÷���.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
			
		}finally{
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("��ġ ������ �����մϴ�.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰����� �����մϴ�.");
		}
	}
	static void copyFiles() {/* �ڵ��ۼ� */}
	static void deleteTempFiles() {/* �ڵ��ۼ� */}
	static boolean enoughSpace() {
		//��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return false;
	}static boolean enoughMemory() {
		//��ġ�ϴµ� �ʿ��� �޸� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
	}
	//Exception Ŭ������ ��
}
//����� ���� ����. 
class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}