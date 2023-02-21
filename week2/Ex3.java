package week2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int a,b;
		Scanner input =new Scanner(System.in);
		System.out.print("Input Number a: ");
		a=input.nextInt();
		System.out.print("Input Number b: ");
		b=input.nextInt();
//		System.out.printf("phuong trinh %dx+%d=0",a,b);
		giaiPTBac1(a, b);
	}
	public static void giaiPTBac1(int a, int b) {
		if (a==0&&b!=0) 
			System.out.printf("phuong trinh %dx+%d=0 vo nghiem",a,b);
		if (a==0&&b==0) 
			System.out.printf("phuong trinh %dx+%d=0 vo so nghiem",a,b);
		if (a!=0) 
			System.out.printf("%f la nghiem cua PT %dx+%d=0",(double)-b/a,a,b);
	}

}
