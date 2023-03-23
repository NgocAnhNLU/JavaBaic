package week4;

import java.util.Arrays;
import java.util.Iterator;

public class Ex5UtlisTest {
	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		int num = 5;
		int[] newArr;
		// khai bao amng đẻ test
		int[][] arr = { { 1, 2, 3, 5, 5, 5, 9, 9, 5, 5 },
				{ -1, -2, -3, 4, 5, 5, 5, 5, 7, 5, 5, 5 } };
		for (int[] is : arr) {
			System.out.printf("so %d %s xuat hien trong day ", num, ex5.isAppear(is, num) == true ? "co" : "khong");
			System.out.println(Arrays.toString(is));
			System.out.printf("so %d xuat hien %d lan ", num, ex5.coutNum(is, num));
			System.out.printf(" o vi tri so: ");
			ex5.findIndex(is, num);
			ex5.boX(is, num);
			System.out.println("-------------------------------");
		}
	}

}
