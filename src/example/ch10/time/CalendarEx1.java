package example.ch10.time;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("�� ���� �⵵:"+today.get(Calendar.YEAR));
		System.out.println("�̹����� ��(0~11, 0:1��) : "+ today.get(Calendar.MONTH));
		System.out.println("�̹��ִ� �� ���� �� °��? "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�̹��ִ� �̹����� �� ����? "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println();
		
		//Date �� DAY_OF_MONTH �� ����
		System.out.println("�� ���� ���� : "+today.get(Calendar.DATE));
		System.out.println("�� ���� ���� : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�̴��� �� ° ���� "+today.get(Calendar.DAY_OF_WEEK)); // 1: SUN ~ 7: SAT
		System.out.println("�� ���� �� ° ����: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//API ��������
		
		
		
	}
}
