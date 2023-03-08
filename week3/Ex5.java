package week3;

import java.util.Scanner;

public class Ex5 {

	// hàm tìm ước số lẻ lớn nhất.
	// cho số bắt đầu là (num/2) rồi giảm đân vì 1 và chính nó luôn là ước của chính
	// mình.
	public static int divisor(int num) {
		for (int i = num / 2; i > 0; i--) {
			if (num % i == 0 && i % 2 != 0) {
				return i;
			}
		}
		return 1;
	}

	// hàm kiểm tra số nguyên tố.
	public static boolean isPrimeNum(int num) {
		if (num > 0) {
			if (num <= 1)
				return false;
			for (int i = 2; i <= (int) Math.sqrt(num); i++) {
				if (num % i == 0) {
					// chỉ cần 1 lần sai là trả về sai và thoát khỏi hàm
					return false;
				}
			}
			// hoàn thành hết vòng lặp mà không báo sai thì số là số nguyên tố.
			return true;
		}
		System.out.println("chi tinh so tu nhien");
		return false;

	}

	public void primeNumberAnalysis(int n) {
		int i, exponent = 0;
		if (n > 0) {
			System.out.printf("so %d =", n);
			for (i = 2; i <= n; i++)// cho chạy từ 2->n
			{
				if (n % i == 0) {
					// chia hết số lần có thể chia cho 1 số i để tính số mũ
					while (n % i == 0) {
						n = n / i;
						// khi thực hiện 1 vòng lặp while thì cộng 1 số mũ cho i
						exponent += 1;
					}
					// sau khi xong vòng lặp for (không thể chia tiếp cho 1 số i), ta in số i kèm
					// với số mũ của i
					System.out.printf("%d^%d.", i, exponent);
					// reset số mũ về 0 trước khi thực hiện lại vòng lặp for lớn
					exponent = 0;
				}
			}
			System.out.println();
		} else
			System.out.println("chi tinh so tu nhien");

	}

	public void printPrimeNum(int num) {
		if (num > 0) {
			System.out.printf("day so nguyen to < %d la: ", num);
			for (int i = 1; i < num; i++) {
				if (isPrimeNum(i)) {
					System.out.print(i + ", ");
				}
			}
		} else
			System.out.println("chi tinh so duong thoi");
	}
}
