package base_12_classlib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Classlib_09_DateFormat {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();//new һ��ϵͳʱ��
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");//����һ�����ڸ�ʽ���࣬���췽���еĲ�������Ҫ��ʽ���ɵ���ʽ
		System.out.println(sdf.format(date));//DateתString
		
		String str = "2009/09/09 09:09:09";//���ڵ��ַ���
		Date date1 = sdf.parse(str);//ת��Date
		System.out.println(date1);
		
		/*���ֻ��� java.text.ParseException: Unparseable date: "2009-09-09 09:09:09"�쳣
		 * ��Ϊ��ʽ��ƥ��
		 * str = "2009-09-09 09:09:09";
		date1 = sdf.parse(str);//ת��Date
		System.out.println(date1);*/
		
		//��ʽ����ʱ�����ûдȫ��Date���Ͱ�Ĭ�ϲ�ȫ
		str = "2009-09-09";
		sdf =  new SimpleDateFormat("yyyy-MM-dd");
		date1 = sdf.parse(str);//ת��Date
		System.out.println(date1);//Wed Sep 09 00:00:00 CST 2009
		
		
	}
}
