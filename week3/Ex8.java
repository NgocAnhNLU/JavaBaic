package week3;

import java.util.Scanner;

public class Ex8 {
	public int sumArr(int n) {
		if (n > 0) {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			return sum;
		} else {
			System.out.println("<khong co tinh so am dc>");
			return 0;
		}
	}

	public double fact(int n) {
		if (n > 0) {
			double factnum = 1;
			for (int i = 1; i <= n; i++) {
				factnum *= i;
			}
			return factnum;
		}
		else {
			System.out.println("<khong co tinh so am dc>");
			return 0;
			
		}
	}
}
