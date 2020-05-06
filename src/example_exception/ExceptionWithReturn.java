package example_exception;

public class ExceptionWithReturn {
	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e){
			System.out.println("main 메소드에서 예외가 처리되었습니다");
		}
	}
	static int method1() { //throws Exception
		try {
			System.out.println("method1 이 호출되었습니다.");
			//throw new Exception();
			return 0; // 현재 실행중인 메소드를 종료한다.
			
		}catch(Exception e){
			e.printStackTrace();
			return 1; // catch 블럭 내에도 return 문 필요
		}finally {
			System.out.println("method1 메소드의 fianlly 블럭이 실행되었습니다.");
		}
	}
}
