package example_iteration;
/*
 * 자바의 정석 
 * charAt(int i) 사용하기 왼쪽부터 인덱스 i =0 
 */
public class Ch4_9_Ex {
	public static void main(String[] args) {
	int sum = 0;
	String str="12345";
	for(int i =0; i<str.length(); i++) {
		sum+=str.charAt(i);
		//System.out.println(str.charAt());
	}
	System.out.println(sum);
	}
}
