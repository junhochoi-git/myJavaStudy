package example_iteration;
/*
 * 자바의 정석
 * Math.random() 을 이용해서 1 부터 6 사이의 임의의 정수를 변수 value 에 저장 하는 코드를  완성하라
 */
public class Ch4_7_Ex {
	public static void main(String[] args) {
		
		int value = (int) (Math.random() * 6 + 1) ;
		System.out.println(value);
	}
}
