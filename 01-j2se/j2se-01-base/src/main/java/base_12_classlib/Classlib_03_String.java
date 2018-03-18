package base_12_classlib;

public class Classlib_03_String {
	public static void main(String[] args) {
		String str = " hWl leo ";
		System.out.println(str.equals("hi"));;//�ж������ַ����Ƿ���ͬ	***
		System.out.println(str.charAt(1));//��ǰ��������Ӧ���ַ�
		System.out.println(str.codePointAt(1));;//��ǰ��������Ӧ���ַ���ascII��
		System.out.println(str.compareTo("addd"));//�Ƚ��ַ�����ֻ��<>=0
		System.out.println(str.concat(" world"));//�ַ�������
		System.out.println(str.contains("d"));//�ַ����Ƿ����"d"	*
		String s1 = "test.txt";
		System.out.println(s1.endsWith(".txt"));;//�Ƿ���".txt"Ϊ��β	*
		System.out.println(s1.startsWith("test"));//�Ƿ���"test"Ϊǰ׺	*
		System.out.println(str.equalsIgnoreCase("HEllo"));//�Ƿ���ͬ�����Դ�Сд��
		byte[] b = str.getBytes();//����ת�����ַ���ת��byte����	*
		System.out.println(b.length);
		System.out.println(b[0]);
		System.out.println(str.indexOf("e"));//��ǰ�ַ�����λ�ã���ǰ�����һ����		**
		System.out.println(str.lastIndexOf("e"));//��ǰ�ַ�����λ�ã��Ӻ���ǰ��һ����
		System.out.println(str.indexOf("k"));//һ�������ж��Ƿ���ĳ���ַ���
		System.out.println(str.isEmpty());//�ж��ַ����ǲ��ǿ��ַ�������null����һ����
		System.out.println(str.indexOf("e", 3));//�ӵ�3��λ�ÿ�ʼ�ҵ�һ��"e"������λ��
		System.out.println(str.length());//�ַ����ĳ���		*
		//str.matches(regex)//�Ƿ�ƥ��
		System.out.println(str.offsetByCodePoints(1, 4));//��λ����������ǣ�������������ַ������ܻ��ɣ�
		System.out.println(str.replace("e", "f"));//�滻����"e"����"f"		*
		//str.replaceAll(regex, replacement)
		//str.replaceFirst(regex, replacement)
		//str.split(regex)�������ָ��ַ���
		System.out.println(str.substring(2));//��ȡ�ַ���	**
		System.out.println(str.substring(0, 2));//>=0,<2	**
		String date = "2017-2-2 08:30:25";
		System.out.println(date.substring(0,8));
		date = "2017-02-25";
		System.out.println(date.substring(5, 7));
		char[] c = str.toCharArray();//�ַ���ת��char[]
		Integer a = Integer.valueOf("3");//�Ѳ����������ת�ɵ����ߵ�����	**
		System.out.println(str.toLowerCase());//ת��Сд	
		System.out.println(str.toUpperCase());//ת�ɴ�д
		System.out.println(str.trim());//ȥ�ո�ǰ��	*
		double d = 0.1200000007;
		System.out.println(String.format("%.2f", d));;//format
		String s3 = String.valueOf(7);//��������ת���ַ���	**
		String s4 = 8 + "";//����ת���ַ���
		//��������֮��ת�������԰ٶȣ�
		System.out.println(c);
		System.out.println(a);
		System.out.println(s3);
		System.out.println(s4);
	}
}
