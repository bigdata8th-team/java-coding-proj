package base_17_thread;
/**
 * �������������߳��໥�ȴ��Է��ͷ���ʱ�ͻᷢ������
 * @author Administrator
 *
 */
public class Thread_06_DeadLock {
	static String k1 = "�����";
	static String k2 = "�ҿ���";
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				String name = Thread.currentThread().getName();
				while(true){
					synchronized (k1) {
						System.out.println(name+"����"+k1+",�ȴ�"+k2);
						synchronized (k2) {
							System.out.println(name+"����"+k2+",�Է�");
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
						System.out.println(name+"����"+k2+",�ȴ�"+k1);
						synchronized (k1) {
							System.out.println(name+"����"+k1+",�Է�");
						}
					}
				}
			}
		}.start();
	}
}
