package week4;

import java.net.Socket;
import java.util.Iterator;

public class Ex3 {
	// function cout num ;
	public static int coutNum(int[] arr, int conditison) {
		int cout = 0;
		switch (conditison) {
			// nếu trạng thái nhâpf vào là -1 là đếm số âm
			case -1:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < 0) {
						cout++;
					}
				}
				break;
			// nếu trạng thái nhâpf vào là 0 là đếm số 0
			case 0:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == 0) {
						cout++;
					}
				}
				break;
			// nếu trạng thái nhâpf vào là 1 là đếm số Dương
			case 1:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > 0) {
						cout++;
					}
				}
				break;
				// ngoại lệ khi nhập sai trạng thái
			default:
				System.out.print("loi nham gia tri ham CoutNum()");
		}
		return cout;
	}

	// function find the larges number
	public static void maxNumNegativeInArr(int[] arr) {
		int i = 0, max;
		// kiểm tra xem dãy có số âm không?
		if (coutNum(arr, -1) != 0) {
			//vì có số âm rồi nên ta có thể cho số âm lớn nhất là số âm nhỏ nhất có thể của int
			max = -2147483647;
			for (int j : arr) {
				if (j < 0 && max < j)
					max = j;
			}
			System.out.println("day co so am lon nhat La: " + max);

		} else {
			System.out.println("day  khong co so am ");

		}
	}

	//  hàm tìm số Dương nhỏ nhất
	public static void minPositiveNum(int[] arr) {
		int i = 0, min;
		if (coutNum(arr, -1) != 0) {
			//vì có số âm rồi nên ta có thể cho số dương nhỏ nhất là số  lớn nhất có thể của int
			min = 2147483647;
			for (int j : arr) {
				if (j > 0 && min > j)
					min = j;
			}
			System.out.println("day co so duong nho nhat La: " + min);

		} else {
			System.out.println("day  khong co so am ");

		}
	}

	//  kiểm tra xem tổng các số âm có bằng tổng các số dương(trị tuyệt đối)
	public static boolean isSumPositiceNegative(int[] arr) {
		int sumPositice = 0, sumNagative = 0;
		for (int i = 0; i < arr.length; i++) {
			// nếu giá trị trong mảng là số dương
			if (arr[i] > 0) {
				// cộng dồng cho tổng dương
				sumPositice += arr[i];
			} else {
				// nếu không cộng dồng cho tổng âm(nếu =0 thì cộng dồn không ảnh hưởng)
				sumNagative += arr[i];
			}
		}
		return (sumNagative + sumPositice) == 0;//neu tong =0 thi 2 tong bang nhau

	}
}
