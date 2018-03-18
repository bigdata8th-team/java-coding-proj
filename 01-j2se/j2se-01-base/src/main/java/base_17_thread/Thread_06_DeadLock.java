package base_17_thread;
/**
 * 死锁，当两个线程相互等待对方释放锁时就会发生死锁
 * @author Administrator
 *
 */
public class Thread_06_DeadLock {
	static String k1 = "左筷子";
	static String k2 = "右筷子";
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				String name = Thread.currentThread().getName();
				while(true){
					synchronized (k1) {
						System.out.println(name+"拿起"+k1+",等待"+k2);
						synchronized (k2) {
							System.out.println(name+"拿起"+k2+",吃饭");
						}
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				String name = Thread.currentThread().getName();
				while(true){
					synchronized (k2) {
						System.out.println(name+"拿起"+k2+",等待"+k1);
						synchronized (k1) {
							System.out.println(name+"拿起"+k1+",吃饭");
						}
					}
				}
			}
		}.start();
	}
}
