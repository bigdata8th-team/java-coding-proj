package base_09_innerclass;

interface I1 {
	public void test1();
}

interface I2 {
	public void test2(String str);
}

interface I3{
	public int test3(int a, int b);
}

/*
 * lambda��Ϊ�˴��������ڲ���ķ����﷨��
 * Ŀ���Ǻ���ʽ�ӿڣ��ӿ�ֻ��һ��������
 * �ββ��֣�����ʡ���βεĲ������ͣ�����βξ�һ������()������ʡ��
 * �����岿�֣�����������һ�仰�����԰�{}����仰����ķֺŶ�ʡ��
 * ��������з���ֵ���Ҿ�һ�仰����������ֻ��һ��return��䣩����return������ʡ��
 * �����෽����    ����::�෽��     (a,b,...)->{����.�෽��(a,b,...)}
 * ����ʵ�������� ����::ʵ������    (a,b,...)->{�ض�����.ʵ������(a,b,...)}
 * ���������ʵ�������� �����::ʵ������   (a,b,...)->{a.ʵ������(b,...)}
 * ���ù�������    ����::new    (a,b,...)->{new ����(a,b,...)}
 */
public class Inner_06_Lambda {
	public static void main(String[] args) {
		I1 i1 = ()->{};//Dog d = new Dog();��������
		i1.test1();
		
		//�Ⱥź�������ʵ���Ǹ����󷽷��أ�()��Ҫд�β�
		I2 i2 = s->System.out.println("hello" + s);
		i2.test2("����");
		
		I3 i3 = (a,b)->(a + b);
		System.out.println(i3.test3(5, 8));
		
		Runnable r = ()->{};
		Object o = (Runnable)()->{};
		
		r.toString();
		o.getClass();
	}
}

