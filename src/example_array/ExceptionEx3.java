package example_array;
/*
 * Ex2 ���� �߻��� ArithmeticException Error �ذ� 
 */

public class ExceptionEx3 {
	public static void main(String[] args) {
		int num=10;
		int result=0;
		for(int i =0; i<10; i++) {
			try {
				result=num / (int)(Math.random()*10);
				System.out.println(i+"Ʈ"+result);
			}catch(ArithmeticException ae) {
				System.out.println("0");
			}
			
		}
	}
}
