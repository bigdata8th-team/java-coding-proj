package misc;

public class Misc_06_Hash {
	public static void main(String[] args) {
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2));
	}
}
