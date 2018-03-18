package base_12_classlib;

public class Classlib_03_String {
	public static void main(String[] args) {
		String str = " hWl leo ";
		System.out.println(str.equals("hi"));;//判断两个字符串是否相同	***
		System.out.println(str.charAt(1));//当前索引所对应的字符
		System.out.println(str.codePointAt(1));;//当前索引所对应的字符的ascII码
		System.out.println(str.compareTo("addd"));//比较字符串，只看<>=0
		System.out.println(str.concat(" world"));//字符串连接
		System.out.println(str.contains("d"));//字符串是否包括"d"	*
		String s1 = "test.txt";
		System.out.println(s1.endsWith(".txt"));;//是否以".txt"为结尾	*
		System.out.println(s1.startsWith("test"));//是否以"test"为前缀	*
		System.out.println(str.equalsIgnoreCase("HEllo"));//是否相同（忽略大小写）
		byte[] b = str.getBytes();//类型转换，字符串转成byte数组	*
		System.out.println(b.length);
		System.out.println(b[0]);
		System.out.println(str.indexOf("e"));//当前字符所在位置（从前往后第一个）		**
		System.out.println(str.lastIndexOf("e"));//当前字符所在位置（从后往前第一个）
		System.out.println(str.indexOf("k"));//一般用来判断是否含有某个字符串
		System.out.println(str.isEmpty());//判断字符串是不是空字符串，和null不是一回事
		System.out.println(str.indexOf("e", 3));//从第3个位置开始找第一个"e"的所在位置
		System.out.println(str.length());//字符串的长度		*
		//str.matches(regex)//是否匹配
		System.out.println(str.offsetByCodePoints(1, 4));//移位，正常结果是５，如果有特殊字符，可能会变成６
		System.out.println(str.replace("e", "f"));//替换，把"e"换成"f"		*
		//str.replaceAll(regex, replacement)
		//str.replaceFirst(regex, replacement)
		//str.split(regex)按条件分割字符串
		System.out.println(str.substring(2));//截取字符串	**
		System.out.println(str.substring(0, 2));//>=0,<2	**
		String date = "2017-2-2 08:30:25";
		System.out.println(date.substring(0,8));
		date = "2017-02-25";
		System.out.println(date.substring(5, 7));
		char[] c = str.toCharArray();//字符串转成char[]
		Integer a = Integer.valueOf("3");//把参数里的类型转成调用者的类型	**
		System.out.println(str.toLowerCase());//转成小写	
		System.out.println(str.toUpperCase());//转成大写
		System.out.println(str.trim());//去空格（前后）	*
		double d = 0.1200000007;
		System.out.println(String.format("%.2f", d));;//format
		String s3 = String.valueOf(7);//其他类型转成字符串	**
		String s4 = 8 + "";//整数转成字符串
		//数据类型之间转换（可以百度）
		System.out.println(c);
		System.out.println(a);
		System.out.println(s3);
		System.out.println(s4);
	}
}
