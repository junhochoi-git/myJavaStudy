package example_oop_abstract;

public class Fighter extends Unit implements Fightable {
	public void move(int x , int y ) {/**/} // Fightable 인터페이스에서는 public abstract 가 생략되있어서 , 
	public void attack(Unit u) {/**/}
}
