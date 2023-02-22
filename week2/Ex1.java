package week2;

import java.util.Scanner;

public class Ex1 {
// tìm số lớn nhất trong 2 số a,b
	 public static void main(String[] args) {
		int a,b,max;
		Scanner input =new Scanner(System.in);
		System.out.print("Input Number a: ");
		a=input.nextInt();
		System.out.print("Input Number b: ");
		b=input.nextInt();
// if a>b max=a else max =b
		max=a>b?a:b;
		System.out.println("number max is: "+max);
	}
}
