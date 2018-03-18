package base_13_collection._01_list;

import java.util.Deque;
import java.util.LinkedList;

public class List_06_Deque {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.push("aaa");
		deque.push("bbb");
		deque.push("ccc");
		deque.push(null);
		deque.push("bbb");
		deque.push("ccc");

		for (String str : deque) {
			System.out.println(str);
		}
		
		System.out.println(deque.size());
		
		
//		while (deque.size() > 0) {
//			System.out.println(deque.pop());
//		}
		
		deque.forEach((s)->System.out.println(s + "---" + deque.size()));
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque);
	}
}
