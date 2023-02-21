package week2;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		double a, b, c;
		int tamGiac = 0;// 0: tuong,1 deu, 2 can, 3 vuong, 4 vuong can
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number a: ");
		a = input.nextDouble();
		System.out.print("Input Number b: ");
		b = input.nextDouble();
		System.out.print("Input Number c: ");
		c = input.nextDouble();
		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c)
				tamGiac = 1;
			else if (a == b || b == c || c == a) {
				tamGiac = 2;
				if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b) {
					tamGiac=3;
				}
			}
			if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b&&tamGiac!=3) 
				tamGiac=4;
			switch (tamGiac) {
			case 0:
				System.out.printf("%f %f %f la tam giac thuong", a, b, c);
				break;
			case 1:
				System.out.printf("%f %f %f la tam giac deu", a, b, c);
				break;
			case 2:
				System.out.printf("%f %f %f la tam giac can", a, b, c);
				break;
			case 3:
				System.out.printf("%f %f %f la tam giac vuong can", a, b, c);
				break;
			case 4:
				System.out.printf("%f %f %f la tam giac vuong", a, b, c);
				break;
			}
		}
		else {
			System.out.printf("%f %f %f is not triangle", a, b, c);
		}
	}

}
