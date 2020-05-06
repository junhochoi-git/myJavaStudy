package example_iteration;

import java.util.Random;

/*
 *  자바의 정석 
 *  두개의 주사위를 던쪗을때, 눈의 합이 6 이 되는 모든 경우의 수를 출력하는 프로그램 을 작성하시오
 */
public class Ch4_6_Ex {
	public static void main(String[] args) {
		int maxTry=100;
		int x=0,y=0;
		
		Random rand = new Random();
		
		for(int i =0; i<maxTry; i++	 ) {
			
			//
			x=rand.nextInt(6)+1;
			y=rand.nextInt(6)+1;
			if((x+y)==6) {
				System.out.println(x+" + "+y+"= "+(x+y));
				
			}
			
		
		}
	}
}
