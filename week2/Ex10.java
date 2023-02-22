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
		// kiêm tra năm nhập vào có phải năm nhuân
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			leapYear = true;
		}
		// mảng từ 0-12 mang giá trị là ngày của 12 tháng tương ứng (index=0 là khôngxài)
		// nếu nhuận dayOfdMonth[2]=29 ngược lại dayOfdMonth[2]=28
		int dayOfdMonth[] = {0, 31, leapYear == true ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		Kiểm tra ngày tháng năm có tồn tại.
		if (d > 0 && d <= dayOfdMonth[m] && m >= 1 && m <= 12 && y > 0) {
			realDay=true;
		}
		// kiểm tra xem ngày tháng nhập vào có tồn taị?
		if (realDay==true) {
			System.out.printf("Sau ngày %d, Tháng %d, Năm %d Là:: ",d,m,y);
			// cộng thêm 1 ngày nếu hết ngày thì qua tháng sau nếu hết tháng thì qua năm sau
			d+=1;
			if (d>dayOfdMonth[m]) {
				d=1;
				m+=1;
				if (m>12) {
					m=1;
					y+=1;
				}
			}
			System.out.printf("ngày %d, Tháng %d, Năm %d ", d,m,y);
		}
		else {
			System.out.printf("Không có ngày %d, Tháng %d, Năm %d ,",d,m,y);
		}

	}
}