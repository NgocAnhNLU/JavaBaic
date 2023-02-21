package week2;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		int tram,chuc,donVi,n;
		Scanner input =new Scanner(System.in);
		System.out.print("input Number(<1000): ");
		n=input.nextInt();
		tram=n/100;
		n-=tram*100;
		chuc =n/10;
		donVi=n-chuc*10;
		String chuSoTramString[]= {"","Một trăm","Hai trăm", "Ba trăm", "Bốn trăm ", "Năm trăm", "Sáu trăm", "Bảy trăm", "Tám trăm","Chín trăm"};
		String chuSoChucString[]= {donVi!=0&&tram!=0?"Linh":"","Mười","Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi","Chín muoi "};
		String chuSoDonViString[]= {"",chuc==0||chuc==1?"Một":"mốt","Hai", "Ba", "Bốn", chuc==0?"Năm":"Lăm", "Sáu", "Bảy", "Tám","Chín"};
		System.out.printf("%s %s %s\n" , chuSoTramString[tram],chuSoChucString[chuc],chuSoDonViString[donVi]);	
		}
}


