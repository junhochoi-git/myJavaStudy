package example_iteration;
/*
 * 방정식 의 모든 해를 구하시오. 단 x와 y는 정수이고 각각의 범위는 다음이다.
 */
public class Ch4_8_Ex {
	public static void main(String[] args) {
		for(int x=0; x<=10; x++) {
			
			for( int y=0; y<=10; y++) {
				
				if(2*x+4*y==10) {
					System.out.println(x+" , "+y);
				}
				
			}
		}
	}
}
