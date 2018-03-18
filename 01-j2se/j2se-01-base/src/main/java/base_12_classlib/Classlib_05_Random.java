package base_12_classlib;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * 随机数是假的，
 * 三种生成随机数的方法
 * Math.random();生成0-1的浮点数
 * Random.nextInt(100);生成１００以内随机整数
 * ThreadLocalRandom tlr.nextInt(30,50);生成30到50的随机数
 */
public class Classlib_05_Random {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-4));//绝对值
		System.out.println(Math.ceil(5.1));//求上限
		System.out.println(Math.floor(5.9));//求下限
		System.out.println(Math.round(5.6));//四舍五入
		System.out.println(Math.max(5,0));//求最大
		System.out.println(Math.pow(5, 3));//求5的3次方
		System.out.println(Math.random());//求随机数
		System.out.println((int)(Math.random()*100));//100以内随机数
		
		Random r = new Random(20);
		Random r1 = new Random(20);
		System.out.println("------------------------");
		System.out.println(r.nextInt(100));
		System.out.println(r1.nextInt(100));
		System.out.println(r.nextInt(100));
		System.out.println(r1.nextInt(100));
		
		ThreadLocalRandom ran = ThreadLocalRandom.current();
		System.out.println(ran.nextInt(30, 50));
		
/*		System.out.println(r.nextDouble());
		System.out.println(r.nextInt(100));*/
		
		
	}
}
