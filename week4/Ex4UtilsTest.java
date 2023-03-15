package week4;

import java.util.Arrays;
import java.util.Iterator;

public class Ex4UtilsTest {
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
		int[][] arr = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { -3, -4, -5, -7, 0, 1, 2, 3, 4, 5 } };
		for (int[] is : arr) {
			System.err.print("day : " + Arrays.toString(is));
			ex4.islandNum(is);
			System.err.println("\nday sau khi dao :" + Arrays.toString(is) + "\n");
		}
	}

}

//			for (int is2 : is) {
//				System.out.printf(", %d",is2);
//				
//			}