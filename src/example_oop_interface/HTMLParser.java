package example_oop_interface;
//�����м������ ���� Parseable �������̽��� HTMLParser Ŭ������ ����
public class HTMLParser implements Parseable {
	
	public void parse(String fileName) {
		System.out.println(fileName+"- HTML parsing completed.");
	}
}
