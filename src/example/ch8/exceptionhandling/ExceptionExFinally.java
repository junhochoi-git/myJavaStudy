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
		//deleteFiles 가 예외가 발생하든 안하든 수행되어야 하므로 이럴때 finally 블럭을 사용하면 좋다.
		finally {
			deleteFiles();
		}
	}
	static void startInstall() {/* 프로그램 설치에 필요한 준비를 하는 코드를 작성*/}
	static void copyFiles() {/* 파일들을 복사하는 코드를 작성*/}
	static void deleteFiles() {/* 임시파일들을 삭제하는 코드를 작성*/}
}
