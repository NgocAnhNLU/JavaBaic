package week4;

import java.util.Arrays;

public class Ex5 {
	public static boolean isAppear(int[] arr, int num) {
		for (int i : arr) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}

//	function fine index ;
	public static void findIndex(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}

	// function cout num ;
	public static int coutNum(int[] arr, int num) {
		int cout = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				cout++;
			}
		}
		return cout;
	}

//	loai bo
	public static void boX(int[] arr, int num) {
		int[] newArr=new int[arr.length-coutNum(arr, num)];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				newArr[j] = arr[i];
				j++;
			}
		}
		System.out.println("day truoc: "+Arrays.toString(arr));
		System.out.println("say sau: "+Arrays.toString(newArr));
	}
}
