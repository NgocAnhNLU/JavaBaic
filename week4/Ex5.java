package week4;

import java.util.Arrays;

public class Ex5 {
	// hàm kiểm tra sô có tồn tại trong dãy hay không
	public static boolean isAppear(int[] arr, int num) {
		for (int i : arr) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}

	// hàm in ra các vị trị của số cho trước
	public static void findIndex(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}

	// hàm đếm số lần xuất hiện của số cho trước có trong mảng
	public static int coutNum(int[] arr, int num) {
		int cout = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				cout++;
			}
		}
		return cout;
	}

	// hàm tạo một mảng mới mà không có số nhất định(cho trước) trong dãy số
	public static void boX(int[] arr, int num) {
		// tạo 1 mảng mới có độ dài bằng mảng cũ trừ số lần số xuất hiện
		int[] newArr = new int[arr.length - coutNum(arr, num)];
		// tạo giá trị index cho mảng mới
		int j = 0;
		// duyệt qua các phần tử trong mảng cũ
		for (int i = 0; i < arr.length; i++) {
			// kiểm tra nếu khác số cần loại bỏ
			if (arr[i] != num) {
				// thêm khác số cho trước vào một mảng mới
				newArr[j] = arr[i];
				// sau khi thêm tăng giá trị cuả mảng mới 1 đơn vị
				j++;
			}
		}
		// in mảng
		System.out.println("day truoc: " + Arrays.toString(arr));
		System.out.println("say sau: " + Arrays.toString(newArr));
	}
}
