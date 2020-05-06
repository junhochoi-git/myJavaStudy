package example.ch10.time;

import java.util.*;;

public class CalendarEx2 {
	public static void main(String[] args) {
		//DAY_OF_WEEK 에서 1: 일요일 ... 7: 토요일임;
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		Calendar date1= Calendar.getInstance();
		Calendar date2= Calendar.getInstance();
		
		//moth의 경우 0 부터 시작하기 때문에, 8월인 경우, 7로 지정해야함
		//date1.set(2020.Calendar.MAY,6); 으로도 할수있음
		date1.set(2020,0,6);
		System.out.println("date1은 "+ toString(date1)+
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고");
		
		System.out.println("오늘(date2)은" + toString(date2)
						+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일 입니다.");
		//두 날짜 간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야함.
		long difference=
				(date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("date1으로 부터 date2까지 "+difference+"초가 지났습니다.");
		System.out.println("일(day)로 계산하면 "+difference/(24*60*60)+"일 입니다."); //1일은 24* 60* 60 s 
	}

	 public static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"년 "
				+(date.get(Calendar.MONTH)+1)+"월 "
				+date.get(Calendar.DATE)+"일 ";
	}
}
