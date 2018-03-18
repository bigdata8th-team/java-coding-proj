package base_13_collection._01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList��
 * �ʺϱ�����80%���������add(),get(index),size()��
 * Ԫ�ؿ��ظ���������null��
 * LinkedList��
 * �ʺϲ���ɾ�������Դ���Queue(����)��Deque(ջ)��
 * Ԫ�ؿ��ظ���������null��
 */

public class List_04_ArrayLinked {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		long a =  System.currentTimeMillis();
			
		for (int i = 0; i < 10000; i++ ){
			arrayList.add(0, "a");
		}
		
		long b = System.currentTimeMillis();
			
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, "a");
		}
		long c = System.currentTimeMillis();
		
		System.out.println(b - a);
		System.out.println(c - b);
	}
}
