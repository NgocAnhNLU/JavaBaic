package week2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int a,b,c;
		double denta,x1,x2;
		Scanner input =new Scanner(System.in);
		System.out.print("Input Number a: ");
		a=input.nextInt();
		System.out.print("Input Number b: ");
		b=input.nextInt();
		System.out.print("Input Number c: ");
		c=input.nextInt();
		if (a==0)
			giaiPTBac1(b, c);
		else {
			denta=Math.pow(b, 2)-(a*a*c);
			if (denta<0) 
				System.out.printf("phuong trinh %dx^2+%d+%d=0 vo nghiem",a,b,c);
			if (denta==0) 
				System.out.printf("phuong trinh %dx^2+%d+%d=0 co nghiem kep la: ",a,b,c,(double)-b/(2*a));
			if (denta>0) {
				x1=(-b+Math.sqrt(denta))/2*a;
				x2=(-b-Math.sqrt(denta))/2*a;
				System.out.printf("phuong trinh %dx^2+%d+%d=0 co 2 nghiem phan biet la: %f %f ",a,b,c,x1,x2);
			}
		}
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
