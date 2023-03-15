package week4;

import java.util.Arrays;
import java.util.Iterator;

public class Ex6UtlisTest {
	public static void main(String[] args) {
		Ex6 ex6 =new Ex6();
		int[][] arr= {{1,2,3,5,5,5,9,9,5,5},
				{-1,-2,-3,4,5,5,5,5,7,5,5,5},
				{9,7,6,4,2,1,0,-1,-4,-5,-7,-8,-9},
				{1,2,3,4,5,6,7,8}};
		for (int[] is : arr) {
			System.out.println("day :"+Arrays.toString(is));
			System.out.printf("day %s day tang dan",ex6.isNumOfIncreases(is)==true?"la":"khong la");
			ex6.arrangeToBeHigh(is);
			System.out.println("\nday sau khi sam xep :"+Arrays.toString(is));
			System.out.println("\n--------------------------------------");
		}
	}

}
