package switchCaseJava;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class SwitchCaseJava_c {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input day of week: ");
		int day = input.nextInt();
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.print("Weekday");
			break;
		case 6:
		case 7:
			System.out.print("Weekend");
			break;

		default: System.out.println("it not a day of week");
			break;
		}

	}

}
