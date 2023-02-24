package week3;

import java.util.Scanner;

public class Ex5 {
	public static boolean primeNum(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int divisor(int num) {
		for (int i = num / 2; i > 0; i--) {
			if (num % i == 0 && i % 2 != 0) {
				return i;
			}
		}
		return 1;
	}
//    public static void  FactPrime(int num) {

	public static void main(String[] args) {
		int n, gcdOdd, j = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("input number 1:");
		n = input.nextInt();
		gcdOdd = divisor(n);
		System.out.printf("so %d co ULLL la: %d\n", n, gcdOdd);
		System.out.println(gcdOdd + " " + primeNum(gcdOdd));
		for (int i = 1; i < gcdOdd; i++) {
			if (primeNum(i)) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("");
		int exponent = 0,i;
		exponent = 0;
		for ( i = 2; primeNum(n)==false; i++) {
			while (n % i == 0) {
				n /= i;
				exponent += 1;
			}
			if(n%i==0)
			System.out.printf("%d^%d*", i, exponent);
		}
	}
}
