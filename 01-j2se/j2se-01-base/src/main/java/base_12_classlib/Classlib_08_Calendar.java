package base_12_classlib;

import java.util.Calendar;
import java.util.Date;

public class Classlib_08_Calendar {
	public static void main(String[] args) {
		
		Date now = new Date();//�������ڶ��󣬻��ϵͳ��ǰ����
		System.out.println(now);
		
		Calendar cal = Calendar.getInstance();//���ϵͳ��ǰ����
		System.out.println("��ǰ���:" + cal.get(Calendar.YEAR));
		System.out.println("��ǰ�·�:" + cal.get(Calendar.MONTH));
		
		//���ڼ�һ��
		cal.add(Calendar.YEAR, 1);
		System.out.println("�޸ĺ�����:" + cal.get(Calendar.YEAR));
		
		//���ڼ�����
		cal.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("�޸ĺ���·�:" + cal.get(Calendar.MONTH));
		
		//���ڼ�һ��
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println("�޸ĺ���·�:" + cal.get(Calendar.MONTH));
		
		System.out.println(cal.getTime());//CalendarתDate
		
		cal.setTime(now);//DateתCalendar
		System.out.println(cal.getTime());
		
		
	}
}
