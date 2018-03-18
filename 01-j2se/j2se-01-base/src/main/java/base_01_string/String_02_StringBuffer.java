package base_01_string;

public class String_02_StringBuffer {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("i love");
		str.append(" china");
		
		System.out.println(str);
		System.out.println(str.insert(0, "what's my love, "));
		System.out.println(str.reverse());
		System.out.println(str);
	}
}
