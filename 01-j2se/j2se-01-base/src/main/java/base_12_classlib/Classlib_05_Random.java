package base_12_classlib;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * ������Ǽٵģ�
 * ��������������ķ���
 * Math.random();����0-1�ĸ�����
 * Random.nextInt(100);���ɣ����������������
 * ThreadLocalRandom tlr.nextInt(30,50);����30��50�������
 */
public class Classlib_05_Random {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-4));//����ֵ
		System.out.println(Math.ceil(5.1));//������
		System.out.println(Math.floor(5.9));//������
		System.out.println(Math.round(5.6));//��������
		System.out.println(Math.max(5,0));//�����
		System.out.println(Math.pow(5, 3));//��5��3�η�
		System.out.println(Math.random());//�������
		System.out.println((int)(Math.random()*100));//100���������
		
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
