package example_oop_interface;

public class ParserManager {
	//리턴ㄴ타입이 Parseable 인터페이스
	public static Parseable getParser(String type){
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p; // return new HTMLParser
		}
	}
}
