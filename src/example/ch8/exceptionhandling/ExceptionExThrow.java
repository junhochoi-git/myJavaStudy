package example.ch8.exceptionhandling;

public class ExceptionExThrow {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의 발생");
			throw e;
			// throw new Exception("고의 발생"); // 위의 두줄을 한줄러.
		}catch(Exception e) {
			System.out.println("에러 메시지 :"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
}
