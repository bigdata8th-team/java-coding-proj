package base_06_abstract;
/*
 * ��������Ǹ��࣬������Ĺ������������
 * ����ͨ����������ǣ�
 * 		������Ĺ������ֲ�ʵ��
 * 		������ֻ�Ǳ���ͨ�����һ�ֳ��󷽷�����������ͨ���ж���������������
 * ��������classǰ���Ϲؼ���abstract
 * ���󷽷��ڷ���ֵǰ���Ϲؼ���abstract
 * ���һ����������󷽷��������г�����
 * �����಻��new ,��Ϊ����������ܻ��г���ķ�����û��ʵ�ֵķ�����
 * ֻҪһ���౻����ɳ����࣬���Ͳ���new 
 * �������ʵ�ֳ���������г��󷽷�����������������new,�����������Ҳ�ǳ�����
 * abstract��final����ͬʱ����һ����
 */
public abstract class Abstract_01_Father {
	static String lastName;
	String name;
	public abstract void display();//���󷽷�������ͨ�����������ǣ�û�д�����
	public void test() {
		System.out.println("test");
	}
	public Abstract_01_Father() {
		System.out.println("Abstract_01_Father constructor");
	}
}
