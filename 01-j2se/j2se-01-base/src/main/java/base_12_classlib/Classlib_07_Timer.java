package base_12_classlib;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时，可延迟，可重复执行，还可以取消
 * 抛异常(Tread.sleep(100))
 * 多线程（发现两件事同时执行）
 */
public class Classlib_07_Timer {
	public static void main(String[] args) throws InterruptedException {
			
		Timer timer = new Timer();//创建了一个定时器
		//创建了一个任务
		TimerTask task = new TimerTask(){
			@Override
			public void run() {
				System.out.println("起床啦.......");
			}
		};
		//timer.schedule(task, 2000);//延迟2000毫秒后执行task任务
		//timer.schedule(task, 2000,1000*60*60*24);//延迟2000毫秒后执行task任务,每隔一天执行一次
		timer.schedule(task, 0,1000);//延迟2000毫秒后执行task任务，每隔一秒执行一次

		//正常情况下是顺序执行
/*		for (int i = 0; i < 100; i++) {
			System.out.println("不好好学习，不天天向上");
			Thread.sleep(500);
		}*/
		
		for (int i = 0; i < 100; i++) {
			System.out.println("好好学习，天天向上");
			Thread.sleep(500);
		}
		
/*		Thread.sleep(5000);//休眠5000毫秒
		timer.cancel();//取消定时器
*/	}
}
