package week5;

public class Ex3UtlisTest {
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },{10,11,12}};
        int[][] expectedTranspose = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
        int[][] expectedSwappedColumns = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };

        // Test transposeMatrix
        int[][] transpose = ex3.transposeMatrix(matrix);
        System.out.println("Ma trận gốc:");
        ex3.printMatrix(matrix);
        System.out.println("Ma trận chuyển vị:");
        ex3.printMatrix(transpose);
        // Test swapColumns
        int[][] swappedColumns = ex3.swapColumns(matrix);
        System.out.println("Ma trận gốc:");
        ex3.printMatrix(matrix);
        System.out.println("Ma trận hoán vị cột:");
        ex3.printMatrix(swappedColumns);
    }
    }

