package week1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("enter your miles: ");
		int mile= input.nextInt();
		double km=mile*1.609;
		System.out.printf("%dmiles=%.3fkm",mile,km);
	}
}
