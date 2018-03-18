package base_17_thread;

public class Thread_04_Tickets {
	public static class Ticket extends Thread {
		static int count = 100;
		//��̬��Ա����obj�������߳�ʵ����˵��Ψһ�ģ����ﲻ����֮ǰ�ĳ�Ա��������Ϊһ��ʵ������һ����Ա���������ܵ���Ψһ����
		static Object obj = new Object();

		@Override
		public void run() {
			while (true) {
				synchronized (obj) {// ��Ϊcount�ǹ�����Դ�����Զ����Ĳ���Ҫ����
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
