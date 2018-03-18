package base_03_final;

public final class FinalDemo {
	
	public static final String NAME = new String("hank");
	public String str1 = "gaosl";
	public final String str2 = new String("gaosl");
	
	final static void display() {
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		final int num = 100;
		
		FinalDemo fd1 = new FinalDemo();
		FinalDemo fd2 = new FinalDemo();
		
		display();
		System.out.println(NAME);
		System.out.println(num);
		
		// 检查final变量的存储情况
		System.out.println(System.identityHashCode(fd1.str1));
		System.out.println(System.identityHashCode(fd2.str1));
		System.out.println(System.identityHashCode(fd1.str2));
		System.out.println(System.identityHashCode(fd2.str2));
	}
}
