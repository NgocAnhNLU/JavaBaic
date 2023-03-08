package week3;

import java.util.Iterator;

import week3.Ex5;

public class Ex5ultilsTest {
	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		int arr[] = { -5, 0, 12, 45, 99,26,48,98 };
		for (int i : arr) {
			System.out.printf("uoc le lon cua so %d la %d\n", i, ex5.divisor(i));
			System.out.printf("so %d %s so nguyen to\n", i, ex5.isPrimeNum(i) == true ? "la" : "khong phai");
			ex5.primeNumberAnalysis(i);
			ex5.printPrimeNum(i);
			System.out.printf("\n__________________________________________\n");
		}
	}

}
