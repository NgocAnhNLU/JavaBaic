package week5;
public class Ex6 {
    
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // lấy giá trị cột hàng của 2 ma trận nhâp vào
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        // kiểm tra xem hai ma trận có thể nhân được không
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Không thể nhân hai ma trận này.");
        }
        
        // khởi tạo ma trận kết quả
        int[][] result = new int[rows1][cols2];
        
        // tính toán phép nhân ma trận
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    // hàm in ma trận
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
