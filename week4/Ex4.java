package week4;

public class Ex4 {
	// hàm hoán vị giá trị 2 số đầu vs cuối-- giữa giữa
	public static void islandNum(int[] arr) {
		int temp, n = arr.length;
		for (int i = 0; i < arr.length+1/ 2; i++) {
			// hoan vi gia tri 2 so
			temp = arr[i];
			arr[i] = arr[n - 1];
			arr[n - 1] = temp;
			n--;
		}

	}
}
