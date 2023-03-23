package week5;

public class Ex3 {
	// Hàm chuyển vị ma trận
	// output là một ma trận mới
	public static int[][] transposeMatrix(int[][] matrix) {
		// tạo một ma trận mới có số dòng bằng số cột và số cột bằng số dòng của ma trận
		// cũ
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[][] transpose = new int[columns][rows];
		// gán lần lượt các cột rồi chuyển hàng khác
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		return transpose;
	}

	// hàm Hoán vị cột 1 và cột n, cột 2 và cột (n-1), cột 3 và cột (n-2),
	// output là một ma trận mới
	public static int[][] swapColumns(int[][] matrix) {
//		lấy số cột của ma trận
		int n = matrix[0].length;
//		cho chạỵ đến 1/2 số cột(vì hoán vị )
		for (int i = 0; i < n / 2; i++) {
//			cho chạy hết một cột 
			for (int j = 0; j < matrix.length; j++) {
//				đổi giá trị 2 số cho nhau
				int temp = matrix[j][i];
				matrix[j][i] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = temp;
			}
		}
//		trả về 1 ma trận mới đã được hoán vị
		return matrix;
	}

	// in ma trận
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
