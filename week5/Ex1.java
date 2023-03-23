package week5;

import java.util.Iterator;
// hàm tìm số lớn nhất trong ma trận
public class Ex1 {
	public static int maxNumInMatrix(int[][] arr) {
		int max = arr[0][0];
		for (int[] is : arr) {
			for (int i = 1; i < is.length; i++) {
				max = max > is[i] ? max : is[i];
			}
		}
		return max;
	}
// hàm tìm số nhỏ nhất trong ma trận
	public static int minNumInMatrix(int[][] arr) {
		int min = arr[0][0];
		for (int[] is : arr) {
			for (int i = 1; i < is.length; i++) {
				min = min < is[i] ? min : is[i];
			}
		}
		return min;
	}
// tổng tất các các số trong ma trận
	public static int sumNumInMatrix(int[][] matrix) {
		int sum = 0;
		for (int[] is : matrix) {
			for (int is2 : is) {
				sum += is2;
			}
		}
		return sum;
	}
// Hàm in ma trận
	public void printMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			System.out.print("|");
			for (int is2 : is) {
				System.out.printf("%3d", is2);
			}
			System.out.println("  |");
		}

	}

}
