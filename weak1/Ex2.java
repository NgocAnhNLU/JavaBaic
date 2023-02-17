package week1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		System.out.print("enter number x: ");
		x = input.nextInt();
		y = 4 * (x - 3) + 20;
		System.out.printf("4(%d-3)+20= %d", x, y);

	}
}
