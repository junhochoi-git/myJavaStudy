package example_oop_interface;
//구문분석기능을 위한 Parseable 인터페이스를 HTMLParser 클래스로 구현
public class HTMLParser implements Parseable {
	
	public void parse(String fileName) {
		System.out.println(fileName+"- HTML parsing completed.");
	}
}
