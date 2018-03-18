package base_01_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_04_Pattern {
	public static void main(String[] args) {
		boolean b = Pattern.matches("\\d+.*", "192.168.1.10");
		System.out.println(b);
		
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher("hello");
		System.out.println(matcher.matches());    // È«Æ¥Åä
		
		String str = "java class:2017";
		matcher = Pattern.compile("\\d+").matcher(str);
		System.out.println(matcher.matches());
		
		if (matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.start());
			System.out.println(matcher.end());
		}
	}
}
