package misc;

import java.util.Random;

public class Misc_05_Random {
	private static long currentId = 1;
	private static long currentTime = System.currentTimeMillis();
	private static Random random = new Random();

	public static long nextId() {
		try {
			currentTime += random.nextInt(1000);
			return currentTime;
		} finally {
			currentId++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(nextId());
	}
}
