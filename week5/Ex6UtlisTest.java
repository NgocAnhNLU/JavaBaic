package week5;

public class Ex6UtlisTest {
	public static void main(String[] args) {
		Ex6 ex6=new Ex6();
		int[][][] matrix= {{{1,2,3},{4,3,2},{9,9,9}},//ma tran 3x3
				{{1,1,1},{2,2,2,},{3,3,3}},//ma tran 3x3
				{{1,1,1},{2,2,2},{3,3,3}},//ma tran 3x3
				{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}};//ma tran 4x3
		int[][] multiplication;
		for (int i = 0; i < matrix.length-1; i++) {
			System.out.println("ma tran:"+i);
			ex6.printMatrix(matrix[i]);
			System.out.printf("ma tran: %d\n",i+1);
			ex6.printMatrix(matrix[i+1]);
			multiplication=ex6.multiply(matrix[i], matrix[i+1]);
			System.out.print("tich 2 ma tran\n");
			ex6.printMatrix(multiplication);
			System.out.println("-------------------");
		}
	
	}
}
