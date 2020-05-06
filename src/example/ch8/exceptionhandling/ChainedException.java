package example.ch8.exceptionhandling;

public class ChainedException {
	public static void main(String[] args) {
		try {
			install();
			System.out.println("설치 완료");
		}catch(InstallException e){
			e.printStackTrace();
		}
	}//main() 끝
	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외발생.");
			ie.initCause(se); // SpaceException se 는 원인 예외
			throw ie;
		}catch(MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생.");
			ie.initCause(me); // SpaceException se 는 원인 예외
			throw ie;
			
		}finally {
			deleteTempFiles();
		}
	}//install() 끝
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { //not enoughspace 가 true 면 실행
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()) { //not memoryhspace 가 true 면 실행
			throw new MemoryException("메모리공간이 부족합니다.");
		}
		
	}//startInstall() 끝
	
	static void copyFiles() {/**/}
	static void deleteTempFiles(){/**/}
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드 적음
		return false;//기본	
		//값들을 true 로하면  예외 발생 line 이 달라짐
	}
	static boolean enoughMemory() {
		//메모리가 충분한지 확인하는 코드 적음
		return true;//기본	
	}
}//ChainedException 클래스 끝

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
