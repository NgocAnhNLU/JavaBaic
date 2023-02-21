package switchCaseJava;

import java.util.Scanner;

public class switchCaseJavs_i {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day;
		System.out.print("Input month: ");
		int month = input.nextInt();
		System.out.print("inout year: ");
		int year = input.nextInt();
		switch (month) {
		case 2:
			day = (checkLeap(year) ? 29 : 28);
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		default:
			day = 31;
			break;
		}
		System.out.printf("month %d, year %d have %d days:\n", month, year, day);
	}

	public static boolean checkLeap(int year) {
		if (year % 4 == 4 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}
}
