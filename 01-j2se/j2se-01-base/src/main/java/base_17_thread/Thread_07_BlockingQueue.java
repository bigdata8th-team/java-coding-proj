package base_17_thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Thread_07_BlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
		try {
			bq.put("aa");
			bq.put("bb");
			System.out.println("aabb");
			bq.put("cc");    // ×èÈû
			System.out.println(bq.take());
			System.out.println(bq.take());
//			bq.put("cc");
			System.out.println(bq.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
