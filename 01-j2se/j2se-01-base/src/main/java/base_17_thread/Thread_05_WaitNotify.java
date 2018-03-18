package base_17_thread;

public class Thread_05_WaitNotify {
	public static void main(String[] args) {
		final Object obj = new Object();
		new Thread() {

			@Override
			public void run() {
				synchronized (obj) {
					System.out.println("in thread1");
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("out thread1");
				}
				
			}
			
		}.start();
		
		new Thread() {

			@Override
			public void run() {
				synchronized (obj) {
					System.out.println("in thread2");
					
					obj.notify();
					
					System.out.println("out thread2");
				}
				
			}
			
		}.start();
	}
}
