package base_07_class;

public class Class_02_Singleton {
	private static Class_02_Singleton s;

	private Class_02_Singleton() {

	}

	public static Class_02_Singleton test(){
		if(s == null){
			s = new Class_02_Singleton();
		}
		return s;
	}
	
	public static void main(String[] args) {
		Class_02_Singleton cs = Class_02_Singleton.test();
		Class_02_Singleton cs1 = Class_02_Singleton.test();
		System.out.println(cs == cs1);
	}
}
