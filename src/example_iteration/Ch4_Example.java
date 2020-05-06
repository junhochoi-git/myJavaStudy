package example_iteration;

/*
 * 자바의 정석 3판 연습문제 풀이 
 * 
 */
public class Ch4_Example {
	
	public static void main(String[] args) {
		
	//4-1
		//1.int 형 변수 x  가 10 보다 크고 20보다 작을 떄 true 조건식
		//int x; if(x>10 && x<20	) {};
		
		//2. char 형 변수 ch 가 공백이나 탭이 아닐때 true 인 조건식 
		//  ch != ' ' && ch != '\t'
		
		//3. char 형 변수 ch 가 ' X ' 또는 'x' 일때 true 인 조건식
		/// ch == 'x' || ch== 'X' 
		
		//4. char 형 변수 ch 가 0~9  숫자일때 true 인 조건식
		//ch>=48 && ch <=57 // ascii 코드 값 
		
		//5. char 형 변수 ch 가 영문자 ( 대문자 또는 소문자일 때) true 인 조건식
		// (ch >= 65 && ch <= 90 ) || (ch>= a && ch <= 122)
		
		//6. int 형 변수 year 가 400 으로 나눠떨어지거나 또는 4로 나눠떨어지고 100 으로 나눠떨어지지 않을 떄 true 인 조건식
		//(year %400)== 0  || ( (year%4)==0 && (year%100)!=0)
		
		//7. boolean 형 변수 powerOn 가 false 일 떄 true 인 조건식
		//boolean powerOn= false , ( powerOn==false)
		// 8. 문자열 참조변수  str 이 " yes " 일 때 true 인 조건식
		//String str; if ( str. String str ="str";if(str=="str") {	System.out.println(str+" 입니다.");	}
	
		// 4-2 부터  까지의 정수 중에서 또는 의 배수가 아닌 수의 총합을 구하시오 1 20 2 3 .
		/*int sum=0;
		 * for (int i =1; i<=20; i++){
		 * 	if(i%2 !=0 || i % 3 !=0){
		 * 		sum+=i;
		 *	}
		 * }
		 */
	
		
		
		
		
		
		
	}
}
