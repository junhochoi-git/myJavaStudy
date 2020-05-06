package example.ch10.time;

import java.util.*;;

public class CalendarEx2 {
	public static void main(String[] args) {
		//DAY_OF_WEEK ���� 1: �Ͽ��� ... 7: �������;
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		Calendar date1= Calendar.getInstance();
		Calendar date2= Calendar.getInstance();
		
		//moth�� ��� 0 ���� �����ϱ� ������, 8���� ���, 7�� �����ؾ���
		//date1.set(2020.Calendar.MAY,6); ���ε� �Ҽ�����
		date1.set(2020,0,6);
		System.out.println("date1�� "+ toString(date1)+
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"�����̰�");
		
		System.out.println("����(date2)��" + toString(date2)
						+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"���� �Դϴ�.");
		//�� ��¥ ���� ���̸� ��������, getTimeInMillis() õ���� ���� ������ ��ȯ�ؾ���.
		long difference=
				(date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("date1���� ���� date2���� "+difference+"�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ� "+difference/(24*60*60)+"�� �Դϴ�."); //1���� 24* 60* 60 s 
	}

	 public static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"�� "
				+(date.get(Calendar.MONTH)+1)+"�� "
				+date.get(Calendar.DATE)+"�� ";
	}
}
