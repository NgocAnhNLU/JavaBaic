package week2;

import java.util.Scanner;

public class Ex7 {
// 	Cho 3 số a, b, c. Xét 3 số đó có là 3 cạnh của tam giác. Nếu đúng, thì kiểm tra tam giác đó
// là tam giác gì? (đều, cân, vuông, vuông cân, thường).
	public static void main(String[] args) {
		double a, b, c;
		//  biến gán cho là: nếu ==0  là tam giác thường, ==1 là tam giác đều, ==2 TG cân, ==3 TG Vuông cân, ==4 Vuông 
		int triangle = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number a: ");
		a = input.nextDouble();
		System.out.print("Input Number b: ");
		b = input.nextDouble();
		System.out.print("Input Number c: ");
		c = input.nextDouble();

		// kiểm tra điều kiện có phải là tam giác
		if (a + b > c && a + c > b && b + c > a) {
			// kiểm tra có phải là tam giác đều
			if (a == b && b == c)
				triangle = 1;
			// nếu không phải kiểm tra có phải cân
			else if (a == b || b == c || c == a) {
					triangle = 2;
					// đã là tam giác cân kiểm tra xem có phải tam giác vuông
					if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b) {
						triangle=3;
					}
				}
			// kiểm tra có phải tam giác vuông mà không phải tam giác vuông cân hay không
			if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b&&triangle!=3) 
				triangle=4;
			// ứng với từng giá trị đã gán in ra tam giác nhâp vào la tam giác gì:
			switch (triangle) {
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
