package week5;

import java.util.Iterator;

public class Ex2 {
	public static boolean isSquareMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			if (is.length!=matrix.length) {
				return false;
			}
		}
		return true;
		
	}
	public static boolean isUpperTriangularMatrix(int[][] matrix) {
		if (isSquareMatrix(matrix)==true) {
			
		    for (int i = 1; i < matrix.length; i++) {
		        for (int j = 0; j < i; j++) {
		            if (matrix[i][j] != 0) {
		                return false;
		            }
		        }
		    }
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
	public static boolean isCenteredSymmetricMatrix(int[][] matrix) {
		if (isSquareMatrix(matrix)==true && matrix.length%2!=0) {
			
		}
	    int n = matrix.length;
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            if (matrix[i][j] != matrix[n-j-1][n-i-1]) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	


}
