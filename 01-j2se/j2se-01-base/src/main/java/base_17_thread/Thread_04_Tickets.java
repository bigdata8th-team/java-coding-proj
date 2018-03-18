package base_17_thread;

public class Thread_04_Tickets {
	public static class Ticket extends Thread {
		static int count = 100;
		//静态成员变量obj，对于线程实例来说是唯一的；这里不能用之前的成员变量，因为一个实例就有一个成员变量，不能当做唯一的锁
		static Object obj = new Object();

		@Override
		public void run() {
			while (true) {
				synchronized (obj) {// 因为count是共享资源，所以对它的操作要加锁
					if (count > 0) {
						System.out.println("count = " + count);
						count--;
					} else {
						System.out.println("tickets cells over;");
						break;
					}
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		Thread t1 = new Ticket();
		Thread t2 = new Ticket();
		Thread t3 = new Ticket();
		Thread t4 = new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
