package example_oop;

public class ReferenceParamEx3 {
	
	static void printArr(int[] arr) {
		System.out.print("(");
		for(int i : arr) {
			System.out.printf(i+" ");	
		}
		System.out.println(" )");
	}
	
	static int sumArr(int[] arr) {
		System.out.println("합은");
		int sum=0;// lv 니까 초기화 하고 쓰도록 하자
		for(int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
		return sum;
	}
	static void sortArr(int[] arr) {
		//오름차순 정렬 ascending order
		for(int i =0; i<arr.length-1;i++) {
			
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,99,6,5,4};
		//출력
		printArr(arr);
		sumArr(arr);
		sortArr(arr);
		printArr(arr);
	//배열 생성하고,
	}
}
