package example_oop_polymorphism;
//�Ű������� ������ ����

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		System.out.println("�ܾ�:"+b.money+"��");
		System.out.println("���� ���ʽ�����Ʈ:"+b.bonusPoint+"��");
		
	}
}