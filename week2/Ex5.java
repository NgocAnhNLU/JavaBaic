package week2;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int a1, a2, b1, b2, giao, hop;
		Scanner input = new Scanner(System.in);
		System.out.print("Input a1: ");
		a1 = input.nextInt();
		System.out.print("Input b1: ");
		b1 = input.nextInt();
		System.out.print("Input a2: ");
		a2 = input.nextInt();
		System.out.print("Input b2: ");
		b2 = input.nextInt();
		// nút sau cuat đoạn 1 lớn hơn nút trước cuả đoạn 2
		if (b1 > a2) {
			giao = b1 - a2;
			hop = b2 - a1;
		// nút sau cuat đoạn 1 hơn hoặc nút trước cuả đoạn 2
		} else {
			giao = 0;
			hop = b1 - a1 + b2 - a2;
		}
		System.out.printf("doan (%d,%d)vs(%d,%d) co giao la: %d \n", a1, b1, a2, b2, giao);
		System.out.printf("doan (%d,%d)vs(%d,%d) co Hop la: %d ", a1, b1, a2, b2, hop);
	}

}
