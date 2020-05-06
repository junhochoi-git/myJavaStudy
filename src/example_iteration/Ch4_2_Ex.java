package example_iteration;

/*
 * 자바의 정석 
 * 예제 4-3
 * 1+ (1+2) + ( 1+2+3)+...+(1+2+3+...+10) 의 결과를 계산하시옿
 */
public class Ch4_2_Ex {
	public static void main(String[] args) {
		
		int part_sum =0;
		int total_sum=0;
		for(int i =0; i <10 ; i++	) {
			
			for(int j=1; j<=i+1; j++ ) {
				part_sum +=j; // 1) 0+ 1 
				System.out.print(part_sum+" ");
			}
			
			total_sum+=part_sum;
			part_sum=0;
			
			System.out.println();
			//System.out.print(total_sum + " ");
			//System.out.println();
		}
		
		System.out.println(total_sum);
		
	}
}
