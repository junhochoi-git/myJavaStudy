package example_oop_interface;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("documnet.xml");
		parser= ParserManager.getParser("HTML");
		parser.parse("documnet2.html");
		
	}
}
