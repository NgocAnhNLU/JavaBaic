package week2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number a: ");
		a = input.nextInt();
		System.out.print("Input Number b: ");
		b = input.nextInt();
		simpleEquation(a, b);
	}
	// Hàm nhận 2 giá trị a,b và giải Phương trình bậc nhất
	public static void simpleEquation(int a, int b) {
		if (a == 0 && b != 0)
			System.out.printf("phương trình %dx+%d=0 vô nghiệm", a, b);
		if (a == 0 && b == 0)
			System.out.printf("phương trình %dx+%d=0 Vô số nghiệm", a, b);
		if (a != 0)
			System.out.printf("%f là nghiệm của phương trình phương trình %dx+%d=0", (double) -b / a, a, b);
	}

}
