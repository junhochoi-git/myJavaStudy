package example.ch10.time;

import java.util.*;

public class CalendarEx6 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage : java CalendarEx6 2020 9 ");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY =0; 
		
		Calendar sDay = Calendar.getInstance(); //시작일 
		Calendar dDay = Calendar.getInstance(); //끝날일
		//@ month 의 경우 0~11 값을 가지므로 -1 ex) 2020년 11월 1 일은 sDay.set(2020, 10,1); 
		sDay.set(year, month-1, 1);
		dDay.set(year, month, 1);
		
		//다음 달의 첫날에서 하루를 뺴면 현재달의 마지막날이 된다.
		//12월 1 일에서 하루를 빼면, 11월 30일이 됨
		dDay.add(Calendar.DATE,-1);
		
		
		
		
		
		
		
		
		
		
		
		
		)
	}
}
