package week4;

public class Ex9 {
	public static int[] sumRow(int[][] matrix) {
		int sum[]=new int[matrix.length];
		if (matrix.length==matrix[0].length) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					sum[i]+=matrix[i][j];
				}
				
			}
			return sum;
		}
		else {
			System.out.println("khong phai ma tran vuong ");
			return null;
		}
		
	}
//	function find the larges number
	public static int maxNumInArr(int[] arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=max<arr[i]?arr[i]:max;
		}
		return max;
	}
	// in ma trận
	public void printMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			System.out.print("|");
			for (int is2 : is) {
				System.out.printf("%3d",is2);
			}
			System.out.println("  |");
		}
		
	}

}
