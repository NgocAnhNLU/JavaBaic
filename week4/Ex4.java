package week4;

public class Ex4 {
	public static void islandNum(int[] arr) {
		int temp, n = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - 1];
			arr[n - 1] = temp;
			n--;
		}

	}
}
