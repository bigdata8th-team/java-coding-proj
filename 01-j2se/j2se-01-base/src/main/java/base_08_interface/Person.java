package base_08_interface;

public class Person implements ProduceAction,Body {
	private String skin;
	
	@Override
	public void eat() {
		System.out.println("Man can eat");
	}

	@Override
	public void speak() {
		System.out.println("Man can speak");
	}

	@Override
	public void run() {
		System.out.println("Man can run");
	}

	@Override
	public void work() {
		System.out.println("Man will work");
	}

	@Override
	public void code() {
		System.out.println("Man can write code");
	}
	
	@Override
	public void setFace(String face) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSkin(String skin) {
		this.skin = skin;
	}

	@Override
	public void setVoice(String voice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showFace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showSkin() {
		System.out.println("�ҵ�Ƥ���ǣ�" + skin);
	}


	
	public static void main(String[] args) {
		// 1.���Զ�ʵ��
		Person man = new Person();
		Action.discribe();
		System.out.println(ProduceAction.WARRING);
		man.eat();
		man.code();
		man.die(90);
		man.setSkin("��ɫ");
		man.showSkin();
	
		// 2.�ýӿ�����ʵ��
		Action people = new Person();
		people.run();
		people.speak();
	}
}
