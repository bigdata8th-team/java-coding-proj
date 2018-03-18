package base_12_classlib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Classlib_09_DateFormat {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();//new 一个系统时间
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");//创建一个日期格式化类，构造方法中的参数就是要格式化成的形式
		System.out.println(sdf.format(date));//Date转String
		
		String str = "2009/09/09 09:09:09";//日期的字符串
		Date date1 = sdf.parse(str);//转成Date
		System.out.println(date1);
		
		/*这种会抛 java.text.ParseException: Unparseable date: "2009-09-09 09:09:09"异常
		 * 因为格式不匹配
		 * str = "2009-09-09 09:09:09";
		date1 = sdf.parse(str);//转成Date
		System.out.println(date1);*/
		
		//格式化的时候如果没写全，Date类型按默认补全
		str = "2009-09-09";
		sdf =  new SimpleDateFormat("yyyy-MM-dd");
		date1 = sdf.parse(str);//转成Date
		System.out.println(date1);//Wed Sep 09 00:00:00 CST 2009
		
		
	}
}
