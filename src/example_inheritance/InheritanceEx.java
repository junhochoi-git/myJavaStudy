package example_inheritance;

//import  example_inheritance.DmbCellphone;


public class InheritanceEx {
	public static void main(String[] args) {
		
		DmbCellphone dmb= new DmbCellphone("아이폰11", "화이트",64);
		
		//CellPhone 으로 부터 상속받은 필드
		System.out.println("모델 :"+dmb.model);
		System.out.println("색상:"+dmb.color);
		//DMb 필드 channel
		System.out.println("채널:"+dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요 여론조사 회사입니다.");
		dmb.handUp();
		dmb.turnOffDmb();
		dmb.changeChannel(128);
		
		dmb.powerOff();
		
		
	}
}
