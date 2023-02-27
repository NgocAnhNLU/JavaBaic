package week3;

import java.util.Scanner;

public class Ex5 {
	// hàm kiểm tra số nguyên tố.
	public static boolean primeNum(int num) {
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

	public static void main(String[] args) {
		int n, gcdOdd, j = 0, newN;
		Scanner input = new Scanner(System.in);
		System.out.print("input number :");
		n = input.nextInt();
		newN = n;// tạo bán sao của n vì rau khi phân tách thành thừa số nguyên tố n sẽ về 1
		gcdOdd = divisor(n);
		System.out.printf("số %d có ước lẻ lớn nhất  là: %d\n", n, gcdOdd);
		// kiểm tra số nguyên tố
		System.out.printf("số %d %s là số nguyên tố\n", gcdOdd, primeNum(gcdOdd) == true ? "" : "không phải");
		int exponent = 0, i;
		System.out.printf("số %d = ", n);
		// hàm phân tích số thành số nguyên tố
		for (i = 2; i <= n; i++)// cho chạy từ 2->n
		{
			if (n % i == 0) {
				// chia hết số lần có thể chia cho 1 số i để tính số mũ
				while (n % i == 0) {
					n = n / i;
					// khi thực hiện 1 vòng lặp while thì cộng 1 số mũ cho i
					exponent += 1;
				}
				// sau khi xong vòng lặp for (không thể chia tiếp cho 1 số i), ta in số i kèm với số mũ của i
				System.out.printf("%d^%d.", i, exponent);
				// reset số mũ về 0 trước khi thực hiện lại vòng lặp for lớn
				exponent = 0;
			}
		}
		// code in số nguyên tố bé hơn ước lẻ lớn nhất của n
		System.out.printf("\ncác số nguyên tố < %d là: ", newN);
		for (i = 1; i < newN; i++) {
			if (primeNum(i)) {
				System.out.print(i + ", ");
			}
		}
	}
}
