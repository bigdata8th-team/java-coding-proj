package base_12_classlib;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ�����ӳ٣����ظ�ִ�У�������ȡ��
 * ���쳣(Tread.sleep(100))
 * ���̣߳�����������ͬʱִ�У�
 */
public class Classlib_07_Timer {
	public static void main(String[] args) throws InterruptedException {
			
		Timer timer = new Timer();//������һ����ʱ��
		//������һ������
		TimerTask task = new TimerTask(){
			@Override
			public void run() {
				System.out.println("����.......");
			}
		};
		//timer.schedule(task, 2000);//�ӳ�2000�����ִ��task����
		//timer.schedule(task, 2000,1000*60*60*24);//�ӳ�2000�����ִ��task����,ÿ��һ��ִ��һ��
		timer.schedule(task, 0,1000);//�ӳ�2000�����ִ��task����ÿ��һ��ִ��һ��

		//�����������˳��ִ��
/*		for (int i = 0; i < 100; i++) {
			System.out.println("���ú�ѧϰ������������");
			Thread.sleep(500);
		}*/
		
		for (int i = 0; i < 100; i++) {
			System.out.println("�ú�ѧϰ����������");
			Thread.sleep(500);
		}
		
/*		Thread.sleep(5000);//����5000����
		timer.cancel();//ȡ����ʱ��
*/	}
}
