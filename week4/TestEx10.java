package week4;

public class TestEx10 {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng 3 chiều chứa 5 ma trận
        int[][][] matrices = {
            {{1, 2, 3}, {0, 4, 5}, {0, 0, 6}}, // Ma trận tam giác trên
            {{1, -2}, {2, -4}}, // Ma trận không phải là vuông
            {{1, -1}, {-1, -1}}, // Ma trận đối xứng qua đường chéo chính
            {{1, -2}, {-2, -4}}, // Ma trận không đối xứng qua đường chéo chính
            {{9,-6,-3},{-6,-9,-6},{-3,-6,-9}}, // Ma trận đối xứng qua đường chéo phụ
            {{1,2,3},{2,9,3},{3,2,1}}
            };
        
        // Duyệt qua các ma trận trong mảng và test các hàm của class Ex10
        for (int i = 0; i < matrices.length; i++) {
            System.out.println("Ma tran thu " + (i+1) + ":");
            printMatrix(matrices[i]); // In ra ma trận hiện tại
            
            System.out.printf("%s ma tran vuong \n",Ex10.isSquareMatrix(matrices[i])==true?"la":"khong");
            
            System.out.printf("%s ma tran tam giac tren \n",Ex10.isUpperTriangularMatrix(matrices[i])==true?"la":"khong");
            
            System.out.printf("%s ma tran doi xung qua duong cheo chinh? \n", Ex10.isSymmetric(matrices[i])==true?"la":"khong");
            
//            System.out.printf("%s ma tran doi xung qua tam  \n", Ex10.isSymmetricMatrix(matrices[i])==true?"la":"khong");
            System.out.println("-------------------------------------");
        }
    }
    
    // Hàm phụ để in ra một ma trận
	public static void printMatrix(int[][] matrix) {
		for (int[] is : matrix) {
			System.out.print("|");
			for (int is2 : is) {
				System.out.printf("%3d",is2);
			}
			System.out.println("  |");
		}
		
	}
}