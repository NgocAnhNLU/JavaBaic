package week1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double area,radius,circumference;
		System.out.print("Input Radiu:  ");
		radius = input.nextDouble();
//		tinh dien tich hinh tron
		area = Math.PI * Math.pow(radius, 2.0);
//		tinh chu vi hinh tron
		circumference=Math.PI * 2 * radius;
		System.out.printf("Area for circle have radius=%f is: %f \n", radius, area);
		System.out.printf("p for circle have radius= %f is: %f " ,radius,circumference );
	}

}
