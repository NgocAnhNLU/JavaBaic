package week1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter your miles: ");
		int mile = input.nextInt();
//		chuyen từ mile sang km, 1 mile = 1.609km
		double km = mile * 1.609;
		System.out.printf("%dmiles=%.3fkm", mile, km);
	}
}
