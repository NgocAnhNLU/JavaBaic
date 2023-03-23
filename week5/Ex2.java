package week5;

import java.util.Iterator;

public class Ex2 {
	// hoàm kiểm tra có phải là ma trận vuông hay không
	public static boolean isSquareMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			if (is.length!=matrix.length) {
				return false;
			}
		}
		return true;
		
	}
	// hàm kiểm tra xem có phải ma trận tam giác trên hay không
	public static boolean isUpperTriangularMatrix(int[][] matrix) {
		//kiểm tra xem có phải là ma trận Vuông hay không ma trận vuông mới có đường chép
		if (isSquareMatrix(matrix)==true) {
			// kiểm tra dưới đường chéo chính đều bằng 0
		    for (int i = 1; i < matrix.length; i++) {
		        for (int j = 0; j < i; j++) {
		            if (matrix[i][j] != 0) {
		                return false;
		            }
		        }
		    }
			//kiểm tra trên đường chéo chính ít nhất một số khác 0
		    for (int i = 0; i < matrix.length; i++) {
				for (int j = i; j < matrix.length; j++) {
					if (matrix[i][j]!=0) {
						return true;
					}
				}
			}
	    
		    return false;
		}
		else {
			System.out.println("khong la ma tran vuong khong co duong cheo");
			return false;
		}
	}
	// kiểm tra xem ma trận có đối xứng qua đường chéo chính hay không
	public static boolean isSymmetric(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i+1; j < matrix.length; j++) {
				if (matrix[i][j]!=matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
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
