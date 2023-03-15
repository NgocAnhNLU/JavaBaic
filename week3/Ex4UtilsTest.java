package week3;

import week3.Ex4;

public class Ex4UtilsTest {
	public static void main(String[] args) {
		int a, b;
		int arr[][] = { { -2, -6 }, { -13, 65 }, { 45, 97 }, { 24, 56 }, { 2147483647, 0 }, { 15, 95 } };
		for (int[] is : arr) {
			a = is[0];
			b = is[1];
			if (Ex4.euGcd(a, b) != 0 && Ex4.euLcm(a, b) != 0) {
				System.out.printf("uoc cung lon nhat cua (%d,%d) la %d\n", a, b, Ex4.euGcd(a, b));
				System.out.printf("boi chung nho nhat cua (%d,%d) la %d\n", a, b, Ex4.euLcm(a, b));
				System.out.println("-------------------------------------");
			}

		}
	}
}
