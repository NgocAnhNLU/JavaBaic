package week3;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, sum = 0, max = 0;
		double avg = 0;
		do {
			System.out.print("Input a number(n=0 is Berak); ");
			n = input.nextInt();
			sum += n;
//		tính số só đã nhập vào
			avg += 1;
			max = n > max ? n : max;
		} while (n != 0);
//		tính trung bình cộng
		avg = sum / avg;
		System.out.printf("Tổng: %d\n", sum);
		System.out.printf("Trung bình cộng: %f\n", avg);
		System.out.printf("Số lớn nhât nhập vào là: %d\n", max);

	}
}
