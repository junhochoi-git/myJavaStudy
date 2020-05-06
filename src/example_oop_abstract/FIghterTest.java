package example_oop_abstract;

public class FIghterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f 는 Unit 클래스의 자손입니다.");
		}
		if( f instanceof Fightable) {
			System.out.println("f는 FIghtable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f 는 Attackable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
		
		//결과 all true
		// Object > Unit > Fighter 
		// Moverable, Attackalbe > Fightable> Fighter 
		
	}
}
