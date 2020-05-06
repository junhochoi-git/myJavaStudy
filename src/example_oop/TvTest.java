package example_oop;

class Tv{
	//속성 & 기능
	//속성 : 크기 길이 높이 색상 볼륨 채널 등 
	String color; 
	boolean power;// 기본 false
	int channel;
	//기능
	void power(){ power= !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	//메소드의 내용은 모든 인스턴스에 대해 동일함.
	
	
	
}

public class TvTest {
	public static void main(String[] args) {
	Tv t1=new Tv(); //클래스 참조변수 = new연산자 생성자
	Tv t2=new Tv();
	//Tv 클래스의 인스턴스 t1 과 인스턴스 t2 를 생성함.
	
	System.out.println("t1의 channel 값은 "+t1.channel+"입니다.");
	System.out.println("t2의 channel 값은 "+t2.channel+"입니다.");
	
	t1.channel=7;
	t1.channelDown();
	
	System.out.println("현재 채널은 " + t1.channel + "입니다");
}
}
