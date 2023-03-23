package week5;

public class Ex2UtlisTest {
	public static void main(String[] args) {
	    int[][] matrix1 = {{1, 0, 0}, {2, 3, 0}, {4, 5, 6}};
	    int[][] matrix2 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
	    int[][] matrix3 = {{1, 2}, {3, 4}, {5, 6}};
	    
	    Ex2 ex2 = new Ex2();
	    System.out.println("\nKiểm tra ma trận tam giác trên:");
	    ex2.printMatrix(matrix1);
	    System.out.println("Ma trận 1: " + ex2.isUpperTriangularMatrix(matrix1)); 
	    ex2.printMatrix(matrix2);
	    System.out.println("Ma trận 2: " + ex2.isUpperTriangularMatrix(matrix2)); 
	    ex2.printMatrix(matrix3);
	    System.out.println("Ma trận 3: " + ex2.isUpperTriangularMatrix(matrix3)); 
	    
	    System.out.println("\nKiểm tra ma trận đối xứng qua đường chéo chính:");
	    ex2.printMatrix(matrix1);
	    System.out.println("Ma trận 1: " + ex2.isSymmetric(matrix1)); 
	    ex2.printMatrix(matrix2);
	    System.out.println("Ma trận 2: " + ex2.isSymmetric(matrix2)); 
	    ex2.printMatrix(matrix3);
	    System.out.println("Ma trận 3: " + ex2.isSymmetric(matrix3)); 
	}


}
