package week4;

import java.util.Iterator;

public class Ex6 {
//	kiem tra chuoi tang dan
	public static boolean isNumOfIncreases(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
	// hàm sắp xếp chuỗi tăng dần
		public static void arrangeToBeHigh(int[] arr){
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i]>arr[j]) {
						int temp;
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
				}

			}
		}
}
