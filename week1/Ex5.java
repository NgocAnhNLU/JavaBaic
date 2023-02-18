package week1;

import java.util.Scanner;
//commen de test git hub
public class Ex5 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		//khai bao doi tuong
		int hour, minute,second;
		System.out.print("enter Second:");
		second=input.nextInt();
		hour=second/3600;
		second-=hour*3600;
		minute=second/60;
		second-=minute*60;
<<<<<<< HEAD:week1/Ex5.java
		System.out.printf("%d:%d':%d\"",hour,minute,second);
=======
		System.out.printf("%dh:%d':%d\"",hour,minute,second);
<<<<<<< HEAD
		System.out.printf("%dh:%d':%d\"",hour,minute,second);
>>>>>>> 7d7ef71bc5755ec7d02504145a2fbefb68a41d81:week1/Ex5.java
=======
//		System.out.printf("%dh:%d':%d\"",hour,minute,second);
>>>>>>> 778dcae03cddb688bd02b9f3b4f94d8da40745e6
		
	}

}
