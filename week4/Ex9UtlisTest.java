package week4;

import java.util.Arrays;

public class Ex9UtlisTest {
	public static void main(String[] args) {
		Ex9 ex9 =new Ex9();
		int[][] matrix= {
				{1,2,3,-4},
				{4,3,2,1},
				{9,9,9,9},
				{6,7,8,9}};
		ex9.printMatrix(matrix);
		System.out.println(Arrays.toString(ex9.sumRow(matrix)));
		System.out.printf("tong dong lon nhat la: %d ",ex9.maxNumInArr(ex9.sumRow(matrix)));
	}

}
