package week2;

import java.util.Scanner;

public class Ex6 {
// 	 kiểm tra 3 số đó có là 3 cạnh của tam giác. Nếu đúng, thì tính chu vi, diện
// tích, và số đo độ của các góc của tam giác.
	public static void main(String[] args) {
		// a,b,c là 2 cạnh của tam giác
		double a, b, c;
		// p là nửa chu vi
		double cperimeter, area, p;
		double cosA, cosB, cosC;
		// A,B,C là 3 góc cuat tam giác ứng với 3 cạnh a,b,c
		double A, B, C;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number a: ");
		a = input.nextInt();
		System.out.print("Input Number b: ");
		b = input.nextInt();
		System.out.print("Input Number c: ");
		c = input.nextInt();
		// kiêm tra điều kiện đúng của tam giác
		if (a + b > c && a + c > b && b + c > a) {
			cperimeter = a + b + c;
			p = cperimeter / 2;
			area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			// tính cos() của từng góc
			cosA = (b * b + c * c - a * a) / (2 * b * c);
			cosB = (-b * b + c * c + a * a) / (2 * a * c);
			cosC = (b * b - c * c + a * a) / (2 * b * a);
			//  dung arcCos tính góc và đổi ra góc Rad và đổi về Độ.
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
