package switchCaseJava;

import java.util.Scanner;

public class switchCaseJava_g {
	public static void main(String[] args) {
		String month;
		int day = 0, year;
		Scanner input = new Scanner(System.in);
		System.out.print("input a month (String)");
		month = input.nextLine();
		System.out.print("input a year: ");
		year = input.nextInt();
		switch (month) {
		case "January":
			day = 31;
			break;
		case "February":
			day = (checkLeap(year) ? 20 : 28);
			break;
		case "March":
			day = 31;
			break;
		case "April":
			day = 30;
			break;
		case "May":
			day = 31;
			break;
		case "June":
			day = 30;
			break;
		case "July":
			day = 31;
			break;
		case "August":
			day = 31;
			break;
		case "September":
			day = 31;
			break;
		case "October":
			day = 30;
			break;
		case "November":
			day = 31;
			break;
		case "December":
			day = 31;
			break;
		default:
			System.out.println("is not a month (String)");
			break;
		}
		System.out.printf("year %d, month %s have; %d days", year, month, day);
	}

	public static boolean checkLeap(int year) {
		if (year % 4 == 4 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}
}