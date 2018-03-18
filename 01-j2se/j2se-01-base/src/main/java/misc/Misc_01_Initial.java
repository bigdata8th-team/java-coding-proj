package misc;

import java.util.Arrays;

public class Misc_01_Initial {
	public static void main(String[] args) {
		// 数组声明
		int a[];
		// int[] b;

		a = new int[10];
		a[0] = 0;
		a[1] = 1;

		// 数组初始化
		// 1.默认初始化
		int num[] = new int[10]; // 初始化为全0
		// String str[] = new String[10]; // 初始化为全null

		// 2.动态初始化
		for (int i = 0; i < num.length; i++) {
			num[i] = i * i;
		}

		System.out.println(Arrays.toString(num));

		// 3.静态初始化
		int arr[] = { 32, 21, 12, 45, 56, 1, 100 };
		int array[] = new int[] { 1, 2, 3, 4 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(array);
	}
}
