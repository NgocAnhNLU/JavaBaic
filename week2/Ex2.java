package week2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		boolean leapYear = false;
		int month, year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Year: ");
		year = input.nextInt();
		if (year>0 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			leapYear = true;
		System.out.printf("Year %d, is %s Year",year,leapYear==true?"leap":"not leap.");
		System.out.print("\nEnter Month: ");
		month = input.nextInt();
		int dayOfdMonth[] = { 0, 31, leapYear == true ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month >= 1 && month <= 12 )
			System.out.printf("Month %d, Year %d, have %d days.",month,year,dayOfdMonth[month]);
	}

}
