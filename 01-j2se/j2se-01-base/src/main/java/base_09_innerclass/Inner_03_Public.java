package base_09_innerclass;

public class Inner_03_Public {
	private int val;

	public void displayVal() {
		System.out.println(val);
	}

	public class InnerClass {
		private int val = 24;

		public void setVal(int newval) {
			Inner_03_Public.this.val = newval;
		}

		public int getVal() {
			return Inner_03_Public.this.val;
		}

		public void displayVal() {
			System.out.println(Inner_03_Public.this.val);
			System.out.println(val);
		}
	}
	
	public static void main(String[] args) {
		// 先生成外部对象，在生成内部对象
		InnerClass ic = new Inner_03_Public().new InnerClass();
		ic.setVal(10);
		ic.getVal();
		ic.displayVal();
	}
}
