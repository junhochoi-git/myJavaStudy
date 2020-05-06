package example.ch8.exceptionhandling;

public class MyException extends Exception {
	
	private final int ERR_CODE;
	
	MyException(String msg, int errCode){
		super(msg);
		ERR_CODE=errCode;
	}
	MyException(String msg){
		this(msg,100); // msg, class �� ������� ERR_CODE �� 100�� �ʱ�ȭ
	}
	public int getErrCode() {
		return ERR_CODE;
	}
}
