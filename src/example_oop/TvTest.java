package example_oop;

class Tv{
	//�Ӽ� & ���
	//�Ӽ� : ũ�� ���� ���� ���� ���� ä�� �� 
	String color; 
	boolean power;// �⺻ false
	int channel;
	//���
	void power(){ power= !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	//�޼ҵ��� ������ ��� �ν��Ͻ��� ���� ������.
	
	
	
}

public class TvTest {
	public static void main(String[] args) {
	Tv t1=new Tv(); //Ŭ���� �������� = new������ ������
	Tv t2=new Tv();
	//Tv Ŭ������ �ν��Ͻ� t1 �� �ν��Ͻ� t2 �� ������.
	
	System.out.println("t1�� channel ���� "+t1.channel+"�Դϴ�.");
	System.out.println("t2�� channel ���� "+t2.channel+"�Դϴ�.");
	
	t1.channel=7;
	t1.channelDown();
	
	System.out.println("���� ä���� " + t1.channel + "�Դϴ�");
}
}
