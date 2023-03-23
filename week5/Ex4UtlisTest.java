package week5;

import java.util.Arrays;

public class Ex4UtlisTest {
    public static void main(String[] args) {
    	Ex4 ex4 =new Ex4();
		int[][][] matrix= {{{1,2,3,-4},{4,3,2,1},{9,9,9,9}},
				{{1,1,1},{2,2,2,},{3,3,3}}}; 
		for (int[][] is : matrix) {
			ex4.printMatrix(is);
			System.out.println("tong cac dong cua ma tran lan luot la:"+Arrays.toString(ex4.sumRows(is)));
			System.out.println("tong dong lon nhat la bang: "+ex4.maxNumInArr(ex4.sumRows(is)));
			System.out.println("-------------------------------------------------");
		}
		}
    
}
