package example_iteration;
/*
 * �ڹ��� ���� 
 * ������ for ���� while ������ �����Ͻÿ�.
 */
public class Ch4_5_Ex {
	public static void main(String[] args) {
		for( int i =0; i<=10; i++) {
			for( int j=0; j<=i; j++) 
				System.out.println("*");
				
			System.out.println();
		}
		
		System.out.println();
		System.out.println("----");
		System.out.println();
		int i =0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
