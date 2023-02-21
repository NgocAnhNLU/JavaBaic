package week1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour, minute, second;
		System.out.print("enter Second:");
		second = input.nextInt();
//		1h có 3600s nên chia lấy phần nguyên để lấy h;
		hour = second / 3600;
//		trừ phần h đã lấy để lấy phần dư tính 
		second -= hour * 3600;
//		một phút có 60s nên chia phần nguyên để lấy phút
		minute = second / 60;
//		trừ số phút đã lầy là còn lại sô giay
		second -= minute * 60;
		System.out.printf("%d:%d:%d", hour, minute, second);

	}
}
