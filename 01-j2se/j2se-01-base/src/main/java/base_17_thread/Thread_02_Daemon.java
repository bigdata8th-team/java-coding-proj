package base_17_thread;

public class Thread_02_Daemon {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {

			@Override
			public void run() {
//				Thread curThread = Thread.currentThread();
//				for (int i = 0; i < 5; i ++) {
//					System.out.println(curThread);
//					System.out.println(curThread.getPriority());
//					System.out.println(curThread.getId());
//					System.out.println(curThread.getName());
//					System.out.println(curThread.isAlive());
//					System.out.println(curThread.getState());
//				}
				System.out.println("守护线程");
				while (true);				
			}
			
		};
		
		t1.setDaemon(true);// 等待所有的非守护线程运行完，才关闭。
		t1.start();
		
		new Thread() {

			@Override
			public void run() {
		
				for (int i = 0; i < 10; i++) {
					System.out.println("thread t2");
				}
				System.out.println(t1.getState());
			}
			
		}.start();
		Thread.sleep(10000);
		
		System.out.println(t1.getState());
	}
}
