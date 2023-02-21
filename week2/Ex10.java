package week2;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int d, m, y;
		boolean leapYear = false, realDay = false;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Day: ");
		d = input.nextInt();
		System.out.print("Enter Month: ");
		m = input.nextInt();
		System.out.print("Enter Year: ");
		y = input.nextInt();
//		check LeapYear if true leapYear=true
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			leapYear = true;
		}
//		mang cac ngay cua thang trong nam 
		int dayOfdMonth[] = {0, 31, leapYear == true ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		kiem tra ngay thang nam co ton tai?
		if (d > 0 && d <= dayOfdMonth[m] && m >= 1 && m <= 12 && y > 0) {
			realDay=true;
		}
		if (realDay==true) {
			System.out.printf("sau ngay %d, thang %d, nam%d la: ",d,m,y);
			d+=1;
			if (d>dayOfdMonth[m]) {
				d=1;
				m+=1;
				if (m>12) {
					m=1;
					y+=1;
				}
			}
			System.out.printf("ngay %d, thang %d, nam %d", d,m,y);
		}
		else {
			System.out.printf("khong co ngay %d, thang %d, nam %d,",d,m,y);
		}

	}
}