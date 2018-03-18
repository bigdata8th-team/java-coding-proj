package misc;

public class Misc_03_ChangedParamList {
	public static void main(String[] args) {
		System.out.println(args.length);
		
		get(1);
		get(1,2);
		get(1,2,3);
		get(1,2,3,4);
	}
	
	public static void get(int ... a) { //ÀàËÆÊı×é
		System.out.println(a.length);
	}
}
