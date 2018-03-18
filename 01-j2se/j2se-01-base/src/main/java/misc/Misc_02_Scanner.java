package misc;

import java.util.Scanner;

public class Misc_02_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("input double");
		double d = scan.nextDouble();
		System.out.println("input string");
		String str = scan.next();

		System.out.println(d);
		System.out.println(str);

		scan.close();
	}
}
