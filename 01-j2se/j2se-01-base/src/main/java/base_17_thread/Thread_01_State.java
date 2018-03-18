package base_17_thread;

public class Thread_01_State {
	public static void main(String[] args) {
		Thread t1 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i ++) {
					System.out.println("thread t1");
				}
			}
			
		};
		
		t1.start();
		Thread t2 = new Thread() {

			@Override
			public void run() {
				try {
					t1.join();// t1ִ���꣬����ִ��t2
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				Thread.yield();// yield���ó�����ʱ��Ƭ
				for (int i = 0; i < 100; i++) {
					System.out.println("thread t2");
				}
			}
			
		};
		t2.start();
	}
}
