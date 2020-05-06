package example_oop_interface;

public class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP=hp;
	}
}
// Unit �� �ļ� �������� ��������

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "TANK";
	}
	
}
class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "DROPSHIP";
	}
}
class Marine extends GroundUnit{
	Marine(){
		super(50);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "MARINE";
	}
}
class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(40);
		 
		hitPoint = MAX_HP;
	}
	//void //String toString 
	public String  StrRepair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			return "���� �Ϸ�";
		}
		return "������ �ʿ䰡 �����ϴ�.";
	}
}

