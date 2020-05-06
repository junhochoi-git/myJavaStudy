package example.ch8.exceptionhandling;

public class MyException extends Exception {
	
	private final int ERR_CODE;
	
	MyException(String msg, int errCode){
		super(msg);
		ERR_CODE=errCode;
	}
	MyException(String msg){
		this(msg,100); // msg, class 의 멤버변수 ERR_CODE 를 100로 초기화
	}
	public int getErrCode() {
		return ERR_CODE;
	}
}
