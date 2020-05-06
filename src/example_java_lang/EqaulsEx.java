package example_java_lang;

public class EqaulsEx {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2같습니다.");
		}else {
			System.out.println("같지 않습니다");
		}
	}
}

class Value{
	int value;
	
	Value(int value){
		this.value=value;
	}
}
