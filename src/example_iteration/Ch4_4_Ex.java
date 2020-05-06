package example_iteration;
/*
 * 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해 나갔을 때, 몇 까지 더해야 총합이 100 이상이 되는 지 구ㅎ시오.
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
