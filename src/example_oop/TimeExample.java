package example_oop;

public class TimeExample {
	// member
	
	// ���� ������ private �� ��������μ� ������ ���� ���� �������� ���ϵ��� �ϰ� ��� �޼��带 ���ؼ� ���� �����ϵ��� �ۼ�
	
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
