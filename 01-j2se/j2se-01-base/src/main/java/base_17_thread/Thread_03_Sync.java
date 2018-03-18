package base_17_thread;

public class Thread_03_Sync {
	static int count = 0;
	static Object obj = new Object();
	
	public static void main(String[] args) {
		
		new Thread() {

			@Override
			public void run() {
				synchronized (obj) {
					for (int i = 0; i < 30; i++) {
						count++;
						System.out.println("thread1-- " + count);
					}
				}	
			}
			
		}.start();
		
		new Thread() {

			@Override
			public void run() {
				synchronized (obj) {
					for (int i = 0; i < 10; i++) {
						count--;
						System.out.println("thread2-- " + count); 
					}
				}	
			}
			
		}.start();
	}
}
