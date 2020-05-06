package example.ch10.time;

import java.util.*;

public class CalendarEx3 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2020, 0,31);
		System.out.println(toString(date));
		
		date.roll(Calendar.MONTH, 1);
		
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+date.get(Calendar.DATE)+"��";
	}
}
