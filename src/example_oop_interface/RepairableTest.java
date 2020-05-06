package example_oop_interface;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine= new Marine();
		SCV scv = new SCV();
		System.out.println(tank.toString()+" "+scv.StrRepair(tank));
		
		scv.StrRepair(dropship);
		//scv.repair(marine); // error 
	}
}
