package week5;

public class Ex5UtlisTest {
	public static void main(String[] args) {
		Ex5 ex5 =new Ex5();
		int[][][] matrix= {{{1,2,3},{4,3,2},{9,9,9}},
				{{1,1,1},{2,2,2,},{3,3,3}},
				{{1,1,1},{2,2,2},{3,3,3}}};
		int [][] sum, difference;
		for (int i = 0; i < matrix.length-1; i++) {
			sum = ex5.sumMatrix(matrix[i], matrix[i+1]);
			difference=ex5.differenceMatrix(matrix[i], matrix[i+1]);
			System.out.println("ma tran:"+i);
			ex5.printMatrix(matrix[i]);
			System.out.printf("ma tran: %d\n",i+1);
			ex5.printMatrix(matrix[i+1]);
			System.out.println("tong 2 ma tran la");
			ex5.printMatrix(sum);
			System.out.println("hieu 2 ma tran la");
			ex5.printMatrix(difference);
			System.out.println("---------------------");
			
			
		}
		
	}

}
