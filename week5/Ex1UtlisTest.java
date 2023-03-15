package week5;

public class Ex1UtlisTest {
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		int[][] matrix = {
				{ 1, 2, 3, -4 },
				{ 4, 3, 2, 1 },
				{ 9, 9, 9, 9 } };
		ex1.printMatrix(matrix);
		System.out.printf("so lon nhat la: %d \n", ex1.maxNumInMatrix(matrix));
		System.out.printf("so be nhat la: %d ", ex1.minNumInMatrix(matrix));
		System.out.printf("\ntong cac so trong ma tran la : %d", ex1.sumNumInMatrix(matrix));
	}

}
