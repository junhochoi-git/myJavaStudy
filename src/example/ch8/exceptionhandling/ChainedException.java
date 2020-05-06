package example.ch8.exceptionhandling;

public class ChainedException {
	public static void main(String[] args) {
		try {
			install();
			System.out.println("��ġ �Ϸ�");
		}catch(InstallException e){
			e.printStackTrace();
		}
	}//main() ��
	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�.");
			ie.initCause(se); // SpaceException se �� ���� ����
			throw ie;
		}catch(MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�.");
			ie.initCause(me); // SpaceException se �� ���� ����
			throw ie;
			
		}finally {
			deleteTempFiles();
		}
	}//install() ��
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { //not enoughspace �� true �� ����
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		if(!enoughMemory()) { //not memoryhspace �� true �� ����
			throw new MemoryException("�޸𸮰����� �����մϴ�.");
		}
		
	}//startInstall() ��
	
	static void copyFiles() {/**/}
	static void deleteTempFiles(){/**/}
	static boolean enoughSpace() {
		//��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ� ����
		return false;//�⺻	
		//������ true ���ϸ�  ���� �߻� line �� �޶���
	}
	static boolean enoughMemory() {
		//�޸𸮰� ������� Ȯ���ϴ� �ڵ� ����
		return true;//�⺻	
	}
}//ChainedException Ŭ���� ��

class InstallException extends Exception{
	InstallException(String msg){
		super(msg);
	}
}
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
