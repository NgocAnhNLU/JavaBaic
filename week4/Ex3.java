package week4;

import java.net.Socket;
import java.util.Iterator;

public class Ex3 {
	// function cout num ;
	public static int coutNum(int[] arr, int conditison) {
		int cout = 0;
		switch (conditison) {
			case -1:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < 0) {
						cout++;
					}
				}
				break;
			case 0:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == 0) {
						cout++;
					}
				}
				break;
			case 1:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > 0) {
						cout++;
					}
				}
				break;
			default:
				System.out.print("loi nham gia tri ham CoutNum()");
		}
		return cout;
	}

	// function find the larges number
	public static void maxNumNegativeInArr(int[] arr) {
		int i = 0, max;
		// kiem tra xem day co so am hay khong moi tinh
		if (coutNum(arr, -1) != 0) {
			// da co so am roi ta cho max la so am nho nhat cua int
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

	// so duong nho nhat
	public static void minPositiveNum(int[] arr) {
		int i = 0, min;
		if (coutNum(arr, -1) != 0) {
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

	// tong am ban tong duong
	public static boolean isSumPositiceNegative(int[] arr) {
		int sumPositice = 0, sumNagative = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sumPositice += arr[i];
			} else {
				sumNagative += arr[i];
			}
		}
		return (sumNagative + sumPositice) == 0;

	}
}
