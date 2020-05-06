package example_oop_polymorphism;

public class InstanceofTest {
	public static void main(String[] args) {
		InstacneEngine fe = new InstacneEngine();
		if( fe instanceof InstacneEngine) {
			System.out.println("this is a instanceoEngine instance");
		}
		
		if(fe instanceof InstanceCar) { // 
			
		}
	}
}

class InstanceCar{
	
}
class InstacneEngine extends InstanceCar{
	
}
