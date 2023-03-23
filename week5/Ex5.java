package week5;

public class Ex5 {
    public static boolean canAddSubtractMatrix(int[][] matrix1, int[][] matrix2) {        
        // Kiểm tra xem hai ma trận có cùng số hàng và cùng số cột hay không
        if (matrix1.length == matrix2.length&& matrix1[0].length== matrix2[0].length) {
            return true;
        } else {
            return false;
        }
    }
    // hàm cộng 2 ma trận
    public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        // tạo ma trận có dòng cột bằng với ma trận cũ
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            int[][] sum = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            
            return sum;
    }
     // hàm trừ 2 ma trận
     public static int[][] differenceMatrix(int[][] matrix1, int[][] matrix2) {
        // tạo ma trận có dòng cột bằng với ma trận cũ
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] difference = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        return difference;
    }
       //  Hàm in ma trận
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
