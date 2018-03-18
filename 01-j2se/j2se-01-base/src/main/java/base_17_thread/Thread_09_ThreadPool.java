package base_17_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_09_ThreadPool {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			Runnable r = new Runnable() {

				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + "...");
				}
				
			};
			es.execute(r);
			
		}
		
		es.shutdown();
	}
}
