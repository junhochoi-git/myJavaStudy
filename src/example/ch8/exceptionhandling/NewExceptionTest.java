package example.ch8.exceptionhandling;

public class NewExceptionTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException se) {
			System.out.println("에러 메시지 : "+se.getMessage());
			se.printStackTrace();
			System.out.println("설치 공간을 확보한 후에 다시 설치해주십시오.");
		}catch(MemoryException me) {
			System.out.println("에러메시지 : "+me.getMessage());
			me.printStackTrace();
			System.gc(); // Garbage Colletction 을 수행하여 메모리를 늘려줌.
			System.out.println("다시 설치를 시도하세요.");
			
		}finally{
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("설치 공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리공간이 부족합니다.");
		}
	}
	static void copyFiles() {/* 코드작성 */}
	static void deleteTempFiles() {/* 코드작성 */}
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}static boolean enoughMemory() {
		//설치하는데 필요한 메모리 공간이 있는지 확인하는 코드를 적는다.
		return true;
	}
	//Exception 클래스의 끝
}
//사용자 지정 예외. 
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