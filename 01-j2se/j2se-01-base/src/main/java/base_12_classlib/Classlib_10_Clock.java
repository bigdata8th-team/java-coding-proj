package base_12_classlib;

import java.time.*;

public class Classlib_10_Clock {
	public static void main(String[] args) {
		/**
		 * 1.8日期类
		 * */
		//Clock：获得有时区的日期和时间
		Clock clock = Clock.systemUTC();//获得当前时间
		System.out.println("用Clock获得当前时间：" + clock.instant());
		System.out.println(System.currentTimeMillis());
		System.out.println(clock.millis());//等价于System.currentTimeMillis()
		//Duration,用来存一段时间
		Duration dur1 = Duration.ofHours(5);
		System.out.println("5小时转成分钟：" + dur1.toMinutes());
		System.out.println("5小时转成天：" + dur1.toDays());
		clock = Clock.offset(clock, dur1);
		System.out.println("当前时间+5小时后的时间：" + clock.instant());
		//Instant：具体时刻，精确到纳秒
		Instant ins = Instant.now();
		System.out.println("Instant获得当前时间：" + ins);
		Instant ins2 = ins.plusSeconds(10000);
		System.out.println("当前时间+10000秒：" + ins2);
		ins2 = ins.plus(dur1);
		System.out.println("当前时间+5小时：" + ins2);
		ins2 = ins.plus(Duration.ofHours(3).plusMinutes(10));
		System.out.println("当前时间+3小时10分钟：" + ins2);
		ins2 = ins.minus(Duration.ofDays(6));
		System.out.println("当前时间-6天：" + ins2);
		//LocalDate无时区的日期
		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate获得当前时间：" + ld);
		ld = LocalDate.of(2015, Month.MAY, 3);
		System.out.println(ld);
		//LocalTime无时区的时间
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime获得当前时间：" + lt);
		lt = LocalTime.of(16, 10);
		System.out.println(lt);
		lt = lt.minus(dur1);
		System.out.println("当前时间-5小时：" + lt);
		//LocalDateTime无时区的日期和时间
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime获得当前时间：" + ldt);
		ldt = ldt.minusHours(5);
		System.out.println("当前时间-5小时：" + ldt);
		//Year代表年
		Year year = Year.now();
		System.out.println("Year获得当前年份：" + year);
		year = year.plusYears(5);
		System.out.println("当前年份+5年：" + year);
		//YearMonth代表年月
		YearMonth ym = YearMonth.now();
		System.out.println("YearMonth获得当前年月：" + ym);
		ym = year.atMonth(5);
		System.out.println("year的5月份：" + ym);
		ym = ym.plusMonths(2).minusMonths(1);
		System.out.println("+2个月-1个月：" + ym);
		//MonthDay
		MonthDay md = MonthDay.now();
		System.out.println("MonthDay获得当前月日：" + md);
		md = md.with(Month.MAY).withDayOfMonth(5);
		System.out.println("修改月份为5月5日：" + md);
	}
}
