package switchCaseJava;

import java.util.Scanner;

public class SwitchCaseJava_d {
	public static void main(String[] args) {
		int language;
		Scanner input = new Scanner(System.in);
		System.out.print("input a number(1-3): ");
		language =input.nextInt();
		switch (language) {
		case 1:System.out.println("English"); break; 
		case 2: System.err.println("French"); break;
		case 3: System.out.println("Spanish"); break;
		default:
			System.out.println("it not 1-3");
		}
	}

}
