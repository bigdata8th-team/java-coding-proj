package base_02_function;

public class FuncDemo {
	public static void main(String[] args) {
		myPrint("helloworld");
		
		int arr[] = {1,2,3,4,5,6,7};
	
		myPollArray(arr);
	}
	
	public static void myPrint(String str) {
		System.out.println(str);
	}
	
	public static void myPollArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
