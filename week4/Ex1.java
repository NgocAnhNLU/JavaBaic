package week4;

public class Ex1 {
//	function find the larges number
	public static int maxNumInArr(int[] arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=max<arr[i]?arr[i]:max;
		}
		return max;
	}
//	function find the Minnumber
	public static int minNumInArr(int[] arr) {
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			min=min>arr[i]?arr[i]:min;
		}
		return min;
	}
//	function fine index ;
	public static void findIndex(int[] arr , int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==num) {
				System.out.print(" "+ i);
			}
		}
		System.out.println();
	}
//	function sum arr
	public static int sumArr(int[] arr) {
		int sum=0;
		for (int i : arr) {
			sum+=i;
		}
		return sum;
	}
	

}
