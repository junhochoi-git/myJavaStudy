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
		
		Calendar sDay = Calendar.getInstance(); //������ 
		Calendar dDay = Calendar.getInstance(); //������
		//@ month �� ��� 0~11 ���� �����Ƿ� -1 ex) 2020�� 11�� 1 ���� sDay.set(2020, 10,1); 
		sDay.set(year, month-1, 1);
		dDay.set(year, month, 1);
		
		//���� ���� ù������ �Ϸ縦 ���� ������� ���������� �ȴ�.
		//12�� 1 �Ͽ��� �Ϸ縦 ����, 11�� 30���� ��
		dDay.add(Calendar.DATE,-1);
		
		
		
		
		
		
		
		
		
		
		
		
		)
	}
}
