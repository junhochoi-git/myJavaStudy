package example_inheritance;

//import  example_inheritance.DmbCellphone;


public class InheritanceEx {
	public static void main(String[] args) {
		
		DmbCellphone dmb= new DmbCellphone("������11", "ȭ��Ʈ",64);
		
		//CellPhone ���� ���� ��ӹ��� �ʵ�
		System.out.println("�� :"+dmb.model);
		System.out.println("����:"+dmb.color);
		//DMb �ʵ� channel
		System.out.println("ä��:"+dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�ȳ��ϼ��� �������� ȸ���Դϴ�.");
		dmb.handUp();
		dmb.turnOffDmb();
		dmb.changeChannel(128);
		
		dmb.powerOff();
		
		
	}
}
