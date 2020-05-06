package example.ch10.time;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("이 해의 년도:"+today.get(Calendar.YEAR));
		System.out.println("이번달은 월(0~11, 0:1월) : "+ today.get(Calendar.MONTH));
		System.out.println("이번주는 이 해의 몇 째주? "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번주는 이번달의 몇 쨰주? "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println();
		
		//Date 와 DAY_OF_MONTH 는 같다
		System.out.println("이 달의 몇일 : "+today.get(Calendar.DATE));
		System.out.println("이 달의 몇일 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이달의 몇 째 요일 "+today.get(Calendar.DAY_OF_WEEK)); // 1: SUN ~ 7: SAT
		System.out.println("이 달의 몇 째 요일: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//API 참조하자
		
		
		
	}
}
