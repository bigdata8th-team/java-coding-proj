package base_07_class;

public class Class_03_EnumTest {
	public static void main(String[] args) {
		switch(Season.FALL){
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case FALL:
			System.out.println("秋天");
			break;
		case WINNER:
			System.out.println("冬天");
			break;
		}
	}
}
