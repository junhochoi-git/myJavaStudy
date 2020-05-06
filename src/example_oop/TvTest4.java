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
public class TvTest4 {
	public static void main(String[] args) {
	Tv[] tvArr= new Tv[3];
	//tv객체를 생성후 tv객체 열의 각 요소 저장
	for( int i =0; i<tvArr.length; i++) {
		tvArr[i]=new Tv();
		tvArr[i].channel= i+10;//chanel 값 ++	
		
	}
	//~출력
	for(int i =0; i<tvArr.length;i++) {
		tvArr[i].channelUp();
		System.out.printf("tvArr[%d].channel= %d \n",i,tvArr[i].channel);
	}
	}
}
