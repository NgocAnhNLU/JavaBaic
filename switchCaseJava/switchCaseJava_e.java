package switchCaseJava;

import java.util.Scanner;

public class switchCaseJava_e {
 public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int direction;
	System.out.print("Enter you number: ");
	direction = input.nextInt();
	switch(direction) {
		case 1:
			System.out.println("North");
			break;
		case 2:
			System.out.println("East");
			break;
		case 3:
			System.out.println("South");
			break;
		case 4:
			System.out.println("West");
		default:
			System.out.println("it not o Direction");
	}
}
}
