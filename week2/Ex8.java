package week2;

import java.util.Scanner;

public class Ex8 {
	// Cho năm dương lịch n. Xác định năm âm lịch tương ứng.
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n, numCan,numChi;
		// mảng String sắp xếp các can
		String[] can = {"Canh","Tân", "Nhâm","Quý","Giáp","Ấn","Bính","Đinh","Mậu","Kỷ"};
		// mảng String sắp xếp các chi
		String[] chi = {"Hợi","Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất"};
		System.out.print("input year: ");
		n=input.nextInt();
		numCan=n%10;
		numChi=(n-3)%12;
		System.out.printf("Nam %d la nam: %s %s",n,can[numCan],chi[numChi]);
		
	}
}
