package switchCaseJava;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int d, m, y, dayOfdMonth=0;
		boolean leapYear = false, realDay = false;
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
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfdMonth=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfdMonth=30;
                break;
            case 2 :
                dayOfdMonth=leapYear==true?29:28;
                break;
        }
        if (d > 0 && d <= dayOfdMonth && m >= 1 && m <= 12 && y > 0) {
			realDay=true;
		}
     // kiểm tra xem ngày tháng nhập có đúng 
     		if (realDay==true) {
     			// cộng thêm 1 ngày nếu hết ngày thì qua tháng sau nếu hết tháng thì qua năm sau
     			d+=1;
     			if (d>dayOfdMonth) {
     				d=1;
     				m+=1;
     				if (m>12) {
     					m=1;
     					y+=1;
     				}
     			}
     			System.out.printf("Next Day is: Day %d, Month %d, Year %d ", d,m,y);
     		}
     		else {
     			System.out.printf("does not exist Day %d, Month %d, Year %d",d,m,y);
     		}


    }
}
