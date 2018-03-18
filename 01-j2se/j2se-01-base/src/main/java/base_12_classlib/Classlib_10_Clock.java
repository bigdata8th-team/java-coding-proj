package base_12_classlib;

import java.time.*;

public class Classlib_10_Clock {
	public static void main(String[] args) {
		/**
		 * 1.8������
		 * */
		//Clock�������ʱ�������ں�ʱ��
		Clock clock = Clock.systemUTC();//��õ�ǰʱ��
		System.out.println("��Clock��õ�ǰʱ�䣺" + clock.instant());
		System.out.println(System.currentTimeMillis());
		System.out.println(clock.millis());//�ȼ���System.currentTimeMillis()
		//Duration,������һ��ʱ��
		Duration dur1 = Duration.ofHours(5);
		System.out.println("5Сʱת�ɷ��ӣ�" + dur1.toMinutes());
		System.out.println("5Сʱת���죺" + dur1.toDays());
		clock = Clock.offset(clock, dur1);
		System.out.println("��ǰʱ��+5Сʱ���ʱ�䣺" + clock.instant());
		//Instant������ʱ�̣���ȷ������
		Instant ins = Instant.now();
		System.out.println("Instant��õ�ǰʱ�䣺" + ins);
		Instant ins2 = ins.plusSeconds(10000);
		System.out.println("��ǰʱ��+10000�룺" + ins2);
		ins2 = ins.plus(dur1);
		System.out.println("��ǰʱ��+5Сʱ��" + ins2);
		ins2 = ins.plus(Duration.ofHours(3).plusMinutes(10));
		System.out.println("��ǰʱ��+3Сʱ10���ӣ�" + ins2);
		ins2 = ins.minus(Duration.ofDays(6));
		System.out.println("��ǰʱ��-6�죺" + ins2);
		//LocalDate��ʱ��������
		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate��õ�ǰʱ�䣺" + ld);
		ld = LocalDate.of(2015, Month.MAY, 3);
		System.out.println(ld);
		//LocalTime��ʱ����ʱ��
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime��õ�ǰʱ�䣺" + lt);
		lt = LocalTime.of(16, 10);
		System.out.println(lt);
		lt = lt.minus(dur1);
		System.out.println("��ǰʱ��-5Сʱ��" + lt);
		//LocalDateTime��ʱ�������ں�ʱ��
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime��õ�ǰʱ�䣺" + ldt);
		ldt = ldt.minusHours(5);
		System.out.println("��ǰʱ��-5Сʱ��" + ldt);
		//Year������
		Year year = Year.now();
		System.out.println("Year��õ�ǰ��ݣ�" + year);
		year = year.plusYears(5);
		System.out.println("��ǰ���+5�꣺" + year);
		//YearMonth��������
		YearMonth ym = YearMonth.now();
		System.out.println("YearMonth��õ�ǰ���£�" + ym);
		ym = year.atMonth(5);
		System.out.println("year��5�·ݣ�" + ym);
		ym = ym.plusMonths(2).minusMonths(1);
		System.out.println("+2����-1���£�" + ym);
		//MonthDay
		MonthDay md = MonthDay.now();
		System.out.println("MonthDay��õ�ǰ���գ�" + md);
		md = md.with(Month.MAY).withDayOfMonth(5);
		System.out.println("�޸��·�Ϊ5��5�գ�" + md);
	}
}
