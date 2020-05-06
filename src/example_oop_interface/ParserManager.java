package example_oop_interface;

public class ParserManager {
	//���Ϥ�Ÿ���� Parseable �������̽�
	public static Parseable getParser(String type){
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p; // return new HTMLParser
		}
	}
}
