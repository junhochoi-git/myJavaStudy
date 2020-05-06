package example_exception;
/*
 * 에러 발생상황 case ArithmethicExcemption Runtime error
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		int number =10;
		int result=0;
		for(int i =0; i<10; i++) {
			result = number/ (int)(Math.random()* 10); // Math.random 은 0.0 보다 같거나 크고 1.0 미만 더블 타입 소수 발생시킴
			System.out.println(result);
		}
	}
}
