package base_01_string;

public class String_01_Function {
	public static void main(String[] args) {
		String name = " gao song ling ";
		
		System.out.println(name);
		System.out.println(name.equals("helo"));
		System.out.println(name.charAt(2));
		System.out.println(name.codePointAt(1)); // ����unicode�ַ����еı��
		System.out.println(name.concat("is a man")); // ����
		System.out.println(name.contains("song")); // �ַ������Ƿ���������ַ���
		System.out.println(name.compareTo("gao songling")); // �Ƚ��ַ���
		System.out.println(name.toUpperCase());	
		System.out.println(name.indexOf('o'));
		System.out.println(name.indexOf("song"));
		System.out.println(name.indexOf('g', 1));
		System.out.println(name.trim());    // ȥ����β�Ŀո�
		
		char myname[] = {'h', 'a', 'n', 'k'};
		System.out.println(String.copyValueOf(myname));
		System.out.println(name);
		
		String s1 = "test.txt";
		System.out.println(s1.endsWith(".txt"));	// �����Ƿ���".txt"��β
		System.out.println(s1.startsWith("test"));  // ����ǰ׺�Ƿ��Կ�ͷ
		System.out.println(s1.equalsIgnoreCase("TEST.TXT")); // ���Դ�Сд
		
		byte[] b = name.getBytes();
		System.out.println(b.length);
		System.out.println(b[0]);
		
		System.out.println(s1.replace('t', 'a')); // �滻
		System.out.println(s1.substring(2)); // ��ȡ�ַ���
		System.out.println(s1.substring(2, 4)); // ��ͷ����β
		
		System.out.println(String.format("%.2f", 12.334456));
		
	}
}
