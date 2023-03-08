package week3;

import java.util.Scanner;

public class Ex2 {
	public int  coutNum(int num) {
        int count = 0;
        num=Math.abs(num);
        do {
            // lấy phần nguyên khi chia cho 10 (để giảm 1 chữ số)
            num /= 10;
            // đếm số chữ số
            count += 1;
        } while (num > 0);
        return count;
	}
	public int reverseumber (int num ) {
		int unit,newNum=0;
//		num=Math.abs(num);
		while (num !=0) {
//			lay don vi
			unit=num%10;
//			tao so moi dao nguoc
			newNum=newNum*10+unit;
//			giam so moi di 1 don vi
			num/=10;
		}
        return newNum;
	}
}