package example_iteration;
/*
 * 1+(-2)+3+(-4)+... �� ���� ������ ��� ���� ������ ��, �� ���� ���ؾ� ������ 100 �̻��� �Ǵ� �� �����ÿ�.
 */
public class Ch4_4_Ex {
	
	public static void main(String[] args) {
		
		int sum =0;
		int num=1; 
		int cnt=0;
		while(sum <100) {
			if(num%2==0) {
				sum+=(-1)*num;
				
			}else {
				sum+=num;
			}
		
		cnt++;
		num++;
		}
		System.out.println("cnt ="+cnt);
	}
}
