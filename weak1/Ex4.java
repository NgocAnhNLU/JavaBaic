package week1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("enter Radiu:  ");
		double area, radius=input.nextDouble();
		area=Math.PI*Math.pow(radius, 2.0);
		System.out.printf("area for circle have radius=%.2f is: %.2f \n",radius,area);//so dai xau nen em lam tron den so thap phan thu 2
		System.out.println("p="+Math.PI*2*radius);
	}

}
