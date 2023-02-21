package week2;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		double a, b, c;
		double cperimeter, area, p;
		double cosA, cosB, cosC;
		double A, B, C;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number a: ");
		a = input.nextInt();
		System.out.print("Input Number b: ");
		b = input.nextInt();
		System.out.print("Input Number c: ");
		c = input.nextInt();
		if (a + b > c && a + c > b && b + c > a) {
			cperimeter = a + b + c;
			p = cperimeter / 2;
			area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			cosA = (b * b + c * c - a * a) / (2 * b * c);
			cosB = (-b * b + c * c + a * a) / (2 * a * c);
			cosC = (b * b - c * c + a * a) / (2 * b * a);
			A = Math.toDegrees(Math.acos(cosA));
			B = Math.toDegrees(Math.acos(cosB));
			C = Math.toDegrees(Math.acos(cosC));
			System.out.printf("%f %f %f is a triangle\n" + "cperimeter:%f\n" + "area:%f\n" + "conrnerA:%f\n"
					+ "conrnerB:%f\n" + "conrnerC:%f\n", a, b, c, cperimeter, area, A, B, C);
		} else {
			System.out.printf("%f %f %f is not triangle", a, b, c);
		}
	}
}
