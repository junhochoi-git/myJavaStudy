package example_oop;

public class TimeExample {
	// member
	
	// 접근 제한자 private 를 사용함으로서 변수의 값을 직접 변경하지 못하도록 하고 대신 메서드를 통해서 값을 변경하도록 작성
	
	private int hour;
	private int minute;
	private int second;
	
	
	//method 
	public int getHour() {return hour;}
	public int getMinute() {return minute;}
	public int getSecond() {return second ;}
	
	
	public void setHour(int h) {
		if(h<0 || h> 23) return;
		//else
		hour=h;
	}
	public void setMinute(int m) {
		if(m<0|| m >60) return;
		
		minute = m;
	}
	public void setSecond(float s	) {
		if(s<0.0f||s>59.99f) return;
		
		second=(int) s;
	}
	
	
	
}
