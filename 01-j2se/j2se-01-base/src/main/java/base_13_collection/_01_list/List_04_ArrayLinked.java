package base_13_collection._01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList：
 * 适合遍历（80%都用这个）add(),get(index),size()，
 * 元素可重复，可以有null。
 * LinkedList：
 * 适合插入删除，可以处理Queue(队列)和Deque(栈)，
 * 元素可重复，可以有null。
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
