package base_10_exception;

public class Exception_02_MyExecption extends Exception {
	private static final long serialVersionUID = 1L;

	public Exception_02_MyExecption() {
		super();
	}
	
	public Exception_02_MyExecption(String message) {
		super(message);
	}
	
	public static void main(String[] args) throws Exception_02_MyExecption {
		test(6);
	}
	
	public static void test(int a) throws Exception_02_MyExecption {
		if (a == 6) {
			throw new Exception_02_MyExecption("抛出我的异常");
		}
	}
}
