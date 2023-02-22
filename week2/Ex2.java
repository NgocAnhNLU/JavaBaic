package week2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		boolean leapYear = false;
		int month, year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Year: ");
		year = input.nextInt();
//kiểm tra năm nhập vào có phải năm nhuận. 
		if (year>0 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			leapYear = true;
		System.out.printf("Year %d, is %s Year",year,leapYear==true?"leap":"not leap.");//nếu năm nhuận in ra "Nhuận" ngược lại in "Không nhuận"
		System.out.print("\nEnter Month: ");
		month = input.nextInt();
// mảng từ 0-12 mang giá trị là ngày của 12 tháng tương ứng (index=0 là không xài)
		int dayOfdMonth[] = { 0, 31, leapYear == true ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };//nếu nhuận dayOfdMonth[2]=29 ngược lại dayOfdMonth[2]=28
		if (month >= 1 && month <= 12 )//kiểm tra tháng có tồn tại?
			System.out.printf("Month %d, Year %d, have %d days.",month,year,dayOfdMonth[month]);
                else
                        System.out.printf("Month %d does not exist",month);
                        
	}

}
