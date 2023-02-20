package switchCaseJava;

import java.util.Scanner;

public class SwitchCaseJava_a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("day of week: ");
		int dayOfWeek = input.nextInt();
		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("khong co ngay: " + dayOfWeek);
			break;
		}
	}
}
