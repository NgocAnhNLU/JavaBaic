package switchCaseJava;

import java.util.Scanner;

public class switchCaseJava_i {
	public static Boolean checkLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

public static void main(String[] args) {
	int month, year;
	Scanner input =new Scanner(System.in);
	System.out.print("Enter month");
	month=input.nextInt();
	System.out.println("Enter Year");
	year=input.nextInt();
	int dayOfdMonth[] = { 0,31, checkLeapYear(year) == true ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	System.out.printf("Month %d, Year %d have: %d Days",month,year,dayOfdMonth[month]);	
	}

}
