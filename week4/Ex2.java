package week4;

public class Ex2 {
//	function fine index ;
	public static int coutNum(int[] arr , int num) {
		int cout=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==num) {
				cout++;
			}
		}
		return cout;
	}
	
//	function find the larges number
	public static int maxNumInArr(int[] arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=max<arr[i]?arr[i]:max;
		}
		return max;
	}

}
