package base_17_thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Thread_08_Download {
	public static void main(String[] args) {
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
		new Thread(){
			public void run(){
				for (int i = 1; i <=10; i++) {
					try {
						//bq.put("�����أ�"+(i*10)+"%");
						bq.put(i+"");
						System.out.println("��������"+i+"���ֿ��л�ʣ��:"+bq.size());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while (true) {
					try {
						System.out.println("�����ѣ�"+bq.take()+"���ֿ⻹ʣ�ࣺ"+bq.size());
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
	}
}
