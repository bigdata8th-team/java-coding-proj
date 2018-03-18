package base_09_innerclass;

interface MyInter {
	public abstract void display();
}

/*
 * �����ڲ���
 * 1.��ͨ���е����ԺͶ����Ǵ����ڶ����
 * 2.Ҫ��������ͱ�����й�����
 * 3.����������������
 * 4.�����ڲ�����û�����ֵ��ڲ���
 * 5.�����ڲ�����൱���ڲ���Ҫ���õ��ⲿ���ӿڵ�һ������
 * 6.�����಻��������������ȥnew����δʵ�ֵĳ��󷽷�ʵ��
 */

public class Inner_05_Anonymous {
	public class Inner implements MyInter {
		public void display() {
			System.out.println("Inner display");
		}
	}

	public static void show(MyInter inter) {
		inter.display();
	}

	public static void main(String[] args) {
		Inner_05_Anonymous.Inner inner = new Inner_05_Anonymous().new Inner();
		show(inner);

		show(new MyInter() {

			@Override
			public void display() {
				System.out.println("Anonymous object");
			}
		});

		new MyInter() {

			@Override
			public void display() {
				System.out.println("Anonymous function test");
			}
		}.display();
	}
}
