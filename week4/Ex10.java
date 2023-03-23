package week4;

import java.util.Iterator;

public class Ex10 {
	// kiểm tra xem có phải ma trận Vuông hay không
	public static boolean isSquareMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			if (is.length != matrix.length) {
				return false;
			}
		}
		return true;

	}
// kieểm tra xem ma trân có là ma trận tam giác tên hay không
	public static boolean isUpperTriangularMatrix(int[][] matrix) {
		if (isSquareMatrix(matrix) == true) {
			// kiểm tra các phân tư dưới dương chéo chính có bằng 0 hết hay không?
			for (int i = 1; i < matrix.length; i++) {
				for (int j = 0; j < i; j++) {
					if (matrix[i][j] != 0) {
						return false;
					}
				}
			}
			// kiểm tra xem có ít nhất 1 phần tử khác 0 hay không ?
			for (int i = 0; i < matrix.length; i++) {
				for (int j = i; j < matrix.length; j++) {
					if (matrix[i][j] != 0) {
						return true;
					}
				}
			}
			return false;
		} else {
			System.out.println("khong la ma tran vuong khong co duong cheo");
			return false;
		}
	}
// kiểm tra ma trạn có đối xứng qua đường chéo chính không ?
	public static boolean isSymmetric(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

}
