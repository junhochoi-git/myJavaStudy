package example_iteration;

import java.util.Random;

/*
 *  �ڹ��� ���� 
 *  �ΰ��� �ֻ����� ��������, ���� ���� 6 �� �Ǵ� ��� ����� ���� ����ϴ� ���α׷� �� �ۼ��Ͻÿ�
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
