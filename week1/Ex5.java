package week1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int hour, minute,second;
		System.out.print("enter Second:");
		second=input.nextInt();
		hour=second/3600;
		second-=hour*3600;
		minute=second/60;
		second-=minute*60;
		System.out.printf("%d:%d':%d\"",hour,minute,second);
		
	}

}
