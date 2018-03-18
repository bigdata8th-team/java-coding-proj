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
						//bq.put("已下载："+(i*10)+"%");
						bq.put(i+"");
						System.out.println("已生产："+i+"，仓库中还剩余:"+bq.size());
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
						System.out.println("已消费："+bq.take()+"，仓库还剩余："+bq.size());
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
	}
}
