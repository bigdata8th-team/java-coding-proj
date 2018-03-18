package base_10_exception;

public class Exception_01_TryCatch {
	
	public static void divide_test(int a, int b) {
		try {
			System.out.println(a + "/" + b + "=" + a/b);
		} catch (ArithmeticException e) {
		    System.out.println("��0");
		} finally {
			System.out.println("finally divide_test");
		}
		System.out.println("out divide_test");
	}
	
	public static void arr_test() {
		int arr[] = {0,20,30};
		
		try {
			divide_test(arr[2], arr[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		} finally { // �����쳣��û�в��񣬶���ִ�С�
			System.out.println("finally arr_test");
		}
		
		System.out.println("out arr_test");
	}
	
	@SuppressWarnings("null")
	public static void except_test() {	
		String str = null;
		try {
			arr_test();	
			System.out.println(str.length());
		} catch (ArithmeticException e) {
		    System.out.println("��0");
		} catch (NullPointerException e) {
			System.out.println("��ָ��");
		} finally {
			System.out.println("finally except_test");
		}
		
		System.out.println("out arr_test");
	}
	
	public static void main(String[] args) {
		except_test();
	}
}
