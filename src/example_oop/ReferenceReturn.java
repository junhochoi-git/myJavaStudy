package example_oop;

class Data{int x;}

public class ReferenceReturn {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x=10;
		Data d2 = copy(d1);
		System.out.println("d1.x = "+d1.x);
		System.out.println("d2.x = "+d2.x);
		
		/*
		 * d2.x=1000; System.out.println("d2.x = "+d2.x);
		 */
	}
	static Data copy(Data d) {
		Data temp= new Data();
		temp.x=d.x;
		return temp;
		
	}
}
