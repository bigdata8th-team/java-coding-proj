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
		System.out.println("我的皮肤是：" + skin);
	}


	
	public static void main(String[] args) {
		// 1.测试多实现
		Person man = new Person();
		Action.discribe();
		System.out.println(ProduceAction.WARRING);
		man.eat();
		man.code();
		man.die(90);
		man.setSkin("红色");
		man.showSkin();
	
		// 2.让接口来接实例
		Action people = new Person();
		people.run();
		people.speak();
	}
}
