package example_iteration;
/*
 * �ڹ��� ���� 
 * charAt(int i) ����ϱ� ���ʺ��� �ε��� i =0 
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
