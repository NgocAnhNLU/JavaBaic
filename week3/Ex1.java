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
//			tinh so so nhap vao
			avg += 1;
			max = n > max ? n : max;
		} while (n != 0);
//		tins trung binh cong
		avg = sum / avg;
		System.out.printf("tong: %d\n", sum);
		System.out.printf("trung binh cong: %f\n", avg);
		System.out.printf("so lon nhat: %d\n", max);

	}
}
