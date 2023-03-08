package week3;

import java.util.Scanner;

public class Ex1 {
//	function input number in arr
	public static void inputArr(int[] arr) {
		Scanner input = new Scanner(System.in);
		int i=0;
		do {
			System.out.print("Input a number(n=0 is Berak): ");
			arr[i]= input.nextInt();
			i++;
			} while (arr[i] != 0);
	}
// sum function
	public static int sumOfArr(int[] arr) {
		int sum=0;
		for (int i : arr) {
			sum+=i;
		}
		return sum;
		}
//	average function
	public static double averageOfArr(int[] arr) {
		Double avg =0.0;
		avg=(double)sumOfArr(arr)/arr.length;
		return avg;
	}
//	find the largest number 
	public static int maxNumInArr(int[] arr) {
		int max=arr[0];
		for (int i : arr) {
			max=max>i?max:i;
		}
		return max;
		
	}

}
