package example_inheritance;

public class DmbCellphone extends Cellphone {
	int channel;
	
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color= color;
		this.channel= channel;
		
	}
	
	void turnOnDmb() {System.out.println("ä��:"+channel+"�� DMB ��� ������ �����մϴ�");}
	void changeChannel(int channel) {
		this.channel= channel;
		System.out.println("ä��:"+ channel +"������ �ٲ���ϴ�.");
	}
	void turnOffDmb() {System.out.println("DMB ����� �����մϴ�");}
	
	
}
