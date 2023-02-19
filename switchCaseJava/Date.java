package switchCaseJava;

import java.util.Scanner;

public class Date {
	int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Boolean checkLeapYear() {
		if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkDayMonthYear() {
		int dayOfdMonth[] = {31, checkLeapYear()==true ? 29:28,31,30,31,30,31,31,30,31,30,31};
		if (this.year <1 || this.month<1 || this.month >12 || this.day <1 || this.day > dayOfdMonth[month])
			return false;
		else {
			return true;
		}
	}
	public void inputt() {
		Scanner input =new Scanner(System.in);
		System.out.println("input day month year:");
		this.day=input.nextInt();
		this.month=input.nextInt();
		this.year=input.nextInt();
		
		
	}
}