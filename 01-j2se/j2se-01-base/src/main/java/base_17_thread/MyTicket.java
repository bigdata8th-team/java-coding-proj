package base_17_thread;
public class MyTicket extends Thread {
		private int count;
		//静态成员变量obj，对于线程实例来说是唯一的；这里不能用之前的成员变量，因为一个实例就有一个成员变量，不能当做唯一的锁
		private Integer obj;
		
		public MyTicket(int a) {
			System.out.println("set " + a);
			count = a;
			obj = a;
		}

		@Override
		public void run() {
			while (true) {
//				synchronized (obj) {// 因为count是共享资源，所以对它的操作要加锁
//					if (count > 0) {
//						System.out.println("count = " + count);
//						count--;
//					} else {
//						System.out.println("tickets cells over;");
//						break;
//					}
//				}
				
				synchronized (obj) {
					System.out.println("=====================");
					count += obj;
					System.out.println("count = " + count);
					System.out.println("=====================");
				}
			}
		}	
	}