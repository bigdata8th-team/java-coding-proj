package base_08_interface;

/*
 * interface�淶��
 * 1.�ӿڲ����зǳ��󷽷��������������
 * 2.������default������1.8������
 * 3.�̳��ǵ��̳У��ӿڿ��Զ�ʵ��
 */
public interface Action {
	public static final String WARRING = "��Ȩ���У�����ؾ�";
	public void eat();  //����ʡ�Թؼ���abstract
	public void speak();
	public void run();
	
	// jdk1.8 �����о�̬�ķ�����ʹ�ã��ӿ���.������������
	public static void discribe() {
		System.out.println("��������Ļ�Ľӿ�");
	}
	
	/*
	 * default��������ʵ������ͨ���������������д��Ҳ����ֱ�ӵ��ã�
	 * �����������д����������Ҫȥ��default�ؼ���
	 */
	public default void die(int life) {
		System.out.println("�������һ��");
		System.out.println("��������Ϊ��" + life + " ��");
	}
}
