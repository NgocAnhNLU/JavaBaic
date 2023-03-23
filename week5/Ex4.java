package week5;

public class Ex4 {
    // hàm tính tổng của từng của ma trận
    public static int[] sumRows(int[][] matrix) {
        int[] rowSums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            rowSums[i] = rowSum;
        }
        return rowSums;
    }
    // hàm tìm số lớn nhất trong một mảng số nguyên
	public static int maxNumInArr(int[] arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=max<arr[i]?arr[i]:max;
		}
		return max;
	}
       // Hàm  in ma trận
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
