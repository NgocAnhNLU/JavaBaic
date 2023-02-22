package week2;

import java.util.Scanner;

public class Ex9 {
	// Cho số tự nhiên n < 1000. Tính ra cách viết số đó bằng chữ.
	public static void main(String[] args) {
		int tram,chuc,donVi,n;
		Scanner input =new Scanner(System.in);
		System.out.print("input Number(<1000): ");
		n=input.nextInt();
		tram=n/100;
		n-=tram*100;
		chuc =n/10;
		donVi=n-chuc*10;
		// mảng cách dọc hàng trăm của từng số ứng với 0-9
		String chuSoTramString[]= {"","Một trăm","Hai trăm", "Ba trăm", "Bốn trăm ", "Năm trăm", "Sáu trăm", "Bảy trăm", "Tám trăm","Chín trăm"};
		// mảng cách dọc hàng chục của từng số ứng với 0-9
		// nếu đơn vị và trăm đều khác 0 thì in ra "Linh" với chục ==0, hoặc in ra "" 1 trong 2 bằng 0 
		String chuSoChucString[]= {donVi!=0&&tram!=0?"Linh":"","Mười","Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi","Chín muoi "};
		// mảng cách dọc hàng đơn vị của từng số ứng với 0-9
		// nếu khi đơn vị ==1 Và chục bằng 1 || 0 thì in ra "Một" không thì in ra  "Mốt"
		// nếu  khi đơn vị ==5 và chục ==0 thì in ra "Năm" không thì in ra "Lăm"
		String chuSoDonViString[]= {"",chuc==0||chuc==1?"Một":"mốt","Hai", "Ba", "Bốn", chuc==0?"Năm":"Lăm", "Sáu", "Bảy", "Tám","Chín"};
		System.out.printf("%s %s %s\n" , chuSoTramString[tram],chuSoChucString[chuc],chuSoDonViString[donVi]);	
		}
}


