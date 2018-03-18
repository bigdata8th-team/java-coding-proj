package base_01_string;

import java.util.Arrays;
import java.util.regex.PatternSyntaxException;

/*
 * ������ʽ
 * 
 * "."��������һ���ַ�
 * "\"ת���ַ�
 * \d    ��ʾ����һ������
 * \w    ��ʾ����һ���ַ������֡���ĸ���»���
 * \s    ��ʾ����һ���հ��ַ���\t \r \n \f \x0B��
 * \D    ��ʾ����һ���������ַ�
 * \W    ��ʾ����һ���ǵ����ַ�
 * \S    ��ʾ����һ���ǿհ��ַ�
 * 
 * {n}    ƥ��n������
 * {n,}   ����ƥ��n��
 * {n,m}  ƥ��n��m��
 * 
 * ()����
 * (() | ()) ��ʾ���ϵ
 * 
 * ^$��ʾ��ͷ���߽�β
 * 
 */
public class String_03_Regex {
	public static void main(String[] args) throws PatternSyntaxException {
		String str = "hello";
		System.out.println(str.matches("\\w+"));
		System.out.println(str.replace("l", "world"));
		System.out.println(str.replaceAll("l", "world")); // �滻����
		System.out.println(str.replaceFirst("l", "world")); // �滻��һ��
		
		str = "hello world";
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String regex = ".";
		String array[] = {"1", ".", "\\", "=", "\t", "abc", "$"};
		
		// �ж�ÿһ��Ԫ���Ƿ�ƥ��
		for (String s : array) {
			System.out.println(s.matches(regex));
		}
		
		str = "hello";
		// �滻Ϊ6
		System.out.println(str.replaceAll("[[:alpha:]]", "6"));
		
		// �ѵ�һ�������������滻��"ff"
		regex = "\\w";
		str = "$jdk8";
		System.out.println(str.replaceAll(regex, "6"));
		
		// ������һ���ǣ����ı���滻Ϊ�ո�
		regex = "[^\u4E00-\u9FA5^\\w^����]";
		str = "12��,.4�����hello,$$..����.����world$";
		System.out.println(str.replaceAll(regex, " "));
		
		// ���ַ����ֳɶ�����ַ���
		str = "�찲�ţ�����������դ������";
		String strs[] = str.split("��");
		System.out.println(Arrays.toString(strs));
	}
}
