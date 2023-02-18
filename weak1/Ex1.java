package week1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int num1;
		double num2;
		System.out.print("please input one integer and one folating-poit number: 8");
		Scanner inputScanner = new Scanner(System.in);
		// System.out.print("integer:");
		num1 = inputScanner.nextInt();
		// System.out.print("folat");
		num2 = inputScanner.nextDouble();
		System.out.printf("Input values are %d and %.2f their product is %.2f \n ", num1, num2, num1 * num2);
	}

}
