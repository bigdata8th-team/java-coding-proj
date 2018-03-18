package base_13_collection._01_list;

import java.util.LinkedList;
import java.util.Queue;

public class List_05_Queue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("hank");
		queue.offer("Bob");
		queue.offer("james");
		queue.offer("hank");
		queue.offer(null);
		queue.offer("james");
		
		
		System.out.println(queue.peek());
		System.out.println(queue.peek()); // 取队首元素，不删除
		System.out.println(queue.poll()); // 删除队首元素并返回该元素
		System.out.println("-------------");
		
//		while (queue.size() > 0) {
//			System.out.println(queue.poll());
//		}
		
		for (String str : queue) {
			System.out.println(str);
		}
	}
}
