package week4;

import java.util.Arrays;
import java.util.Iterator;

public class Ex3UnltisTest {
	public static void main(String[] args) {
		Ex3 ex3 = new Ex3();
		int[][] arr = {
				{ -1, -2, -3, -4, -5, -6, -7, -8, -9 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 },
				{ 2147483647, 0, -2147483647 },
				{ -1, -2, -3, 0, 1, 2, 3 },
				{ -9, -7, -6, -4, -3, -2, -1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7 } };
		for (int[] is : arr) {
			System.out.print("day: "+Arrays.toString(is));
			System.out.printf("\nday co %d so Am\n", ex3.coutNum(is, -1));
			System.out.printf("day co %d so 0\n", ex3.coutNum(is, 0));
			System.out.printf("day co %d so Duong\n", ex3.coutNum(is, 1));
			ex3.maxNumNegativeInArr(is);
			ex3.minPositiveNum(is);
			System.out.printf("day co tong am %s tong duong\n",
					ex3.isSumPositiceNegative(is) == true ? "bang" : "khong bang");
			System.out.println("____________________________________");
		}
	}
}
