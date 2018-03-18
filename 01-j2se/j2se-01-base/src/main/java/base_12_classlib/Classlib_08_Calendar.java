package base_12_classlib;

import java.util.Calendar;
import java.util.Date;

public class Classlib_08_Calendar {
	public static void main(String[] args) {
		
		Date now = new Date();//创建日期对象，获得系统当前日期
		System.out.println(now);
		
		Calendar cal = Calendar.getInstance();//获得系统当前日期
		System.out.println("当前年份:" + cal.get(Calendar.YEAR));
		System.out.println("当前月份:" + cal.get(Calendar.MONTH));
		
		//日期加一年
		cal.add(Calendar.YEAR, 1);
		System.out.println("修改后的年份:" + cal.get(Calendar.YEAR));
		
		//日期加六天
		cal.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("修改后的月份:" + cal.get(Calendar.MONTH));
		
		//日期减一天
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println("修改后的月份:" + cal.get(Calendar.MONTH));
		
		System.out.println(cal.getTime());//Calendar转Date
		
		cal.setTime(now);//Date转Calendar
		System.out.println(cal.getTime());
		
		
	}
}
