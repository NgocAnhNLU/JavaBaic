package week2;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n, numCan,numChi;
//		mang 10 can danh so 1-10
		String[] can = {"Canh","Tân", "Nhâm","Quý","Giáp","Ấn","Bính","Đinh","Mậu","Kỷ"};
		String[] chi = {"Hợi","Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất"};
		System.out.print("input year: ");
		n=input.nextInt();
		numCan=n%10;
		numChi=(n-3)%12;
		System.out.printf("Nam %d la nam: %s %s",n,can[numCan],chi[numChi]);
		
	}
}
