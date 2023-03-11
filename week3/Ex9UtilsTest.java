package week3;

import java.util.Scanner;

public class Ex9UtilsTest {
	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		double arr[][] = { { 1000.0, 12.0, 5 }, { 2000.0, -36.0, 7 },{10000000,6,-10} };
		for (double[] i : arr) {
			if (i[1]>0&& i[0]>0) {
			System.out.printf("so tien %.0f, gui trong %.0f thang voi lai suat %.0f%%/thang nhan duoc la: %.2f",i[0],i[1],i[2],ex9.money(i[0], i[1], i[2]));
			}
			ex9.money(i[0], i[1], i[2]);
//			System.out.println(ex9.money(i[0], i[1], i[2]));
			System.out.println("\n-----------------------------------------------------------------------------------");
		}
	}
}
