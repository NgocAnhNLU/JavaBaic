package week3;

import java.util.Scanner;

public class Ex4 {
    // hàm Thuật toán Euclid tìm Ucln
    public static int euGcd(int a, int b) {
    	int temp;
    	if (a<=0||b<=0) {
    		System.out.println("chi tinh so duong khong tinh so "+a+" vs "+b );
    		System.out.println("----------------------------------------------");
    		return 0;
    	}
    	else {
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
    	}
        return a;
    }
   public static int euLcm(int a , int b) {
	   int lcm;
	   if (euGcd(a, b)==0) {
		   System.out.println("khong tinh so am");
		   return 0;
	   }
	   else {
		
	   lcm=(a*b)/euGcd(a, b);
	   return lcm;
	   }
}
}
