package base_17_thread;
public class MyTicket extends Thread {
		private int count;
		//��̬��Ա����obj�������߳�ʵ����˵��Ψһ�ģ����ﲻ����֮ǰ�ĳ�Ա��������Ϊһ��ʵ������һ����Ա���������ܵ���Ψһ����
		private Integer obj;
		
		public MyTicket(int a) {
			System.out.println("set " + a);
			count = a;
			obj = a;
		}

		@Override
		public void run() {
			while (true) {
//				synchronized (obj) {// ��Ϊcount�ǹ�����Դ�����Զ����Ĳ���Ҫ����
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