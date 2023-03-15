package week4;

public class Ex8UtlisTest {
	public static void main(String[] args) {
		Ex8 ex8 =new Ex8();
		int[][] matrix= {
				{1,2,3,-4},
				{4,3,2,1},
				{9,9,9,9}};
		ex8.printMatrix(matrix);
		System.out.printf("so lon nhat la: %d \n",ex8.maxNumInMatrix(matrix));
		System.out.printf("so be nhat la: %d ",ex8.minNumInMatrix(matrix));
		System.out.printf("\ntong cac so trong ma tran la : %d",ex8.sumNumInMatrix(matrix));
	}
	

}
