package week4;

import java.util.Iterator;

public class Ex7UtlisTest {
	public static void main(String[] args) {
		Ex7 ex7=new Ex7();
		int[][] arr= {{4, 2, 7, 3, 7, 2, 4},
				{-1,2,-3,5,-5,5,-9,0,-5,5},
				{-1,-2,-3,4,5,5,5,5,7,5,5,5},
				{9,7,6,4,2,1,0,-1,-4,-5,-7,-8,-9},
				{1,-2,3,-4,5,-6,7,-8}};
		for (int[] is : arr) {
			System.out.println(ex7.isSymmetric(is));
			System.out.println(ex7.isAlternatingSequence(is));
			System.out.println("______________________________");
		}
	}

}
