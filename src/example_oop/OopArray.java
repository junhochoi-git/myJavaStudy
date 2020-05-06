package example_oop;

public class OopArray {
	public static void main(String[] args) {
		int[] arr= new int[] {10,12,13};
		int result;
		result=add(arr);
		
		System.out.println("гую╨: "+ result);
		
	}
	
	static int add(int[] a) {
		int result=0;
		for(int i : a ) {
			result+=i;
		}
		return result;
	}
}
