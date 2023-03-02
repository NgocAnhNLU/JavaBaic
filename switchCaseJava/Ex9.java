package switchCaseJava;

import java.util.Scanner;

public class Ex9 {
		public static void main(String[] args) {
			int hundred,tens,units,n;
			Scanner input =new Scanner(System.in);
			System.out.print("Enter Number(<1000): ");
			n=input.nextInt();
			hundred=n/100;
			n-=hundred*100;
			tens =n/10;
			units=n-tens*10;
			switch (hundred) {
			case 0: System.out.print("");
				break;
			case 1:System.out.print("mot tram");
				break;
			case 2:System.out.print("hai tram");
				break;
			case 3:System.out.print("ba tram");
				break;
			case 4:System.out.print("bon tram");
				break;
			case 5:System.out.print("nam tram");
				break;
			case 6:System.out.print("sau tram");
				break;
			case 7:System.out.print("bay tram");
				break;
			case 8:System.out.print("tan tram");
				break;
			case 9:System.out.print("chin tram");
				break;
			}
			switch (tens) {
			case 0:System.out.print(" linh");
				break;
			case 1:System.out.print(" muoi");
				break;
			case 2:System.out.print(" hai muoi");
				break;
			case 3:System.out.print(" ba muoi");
				break;
			case 4:System.out.print(" bon muoi");
				break;
			case 5:System.out.print(" nam muoi");
				break;
			case 6:System.out.print(" sao muoi");
				break;
			case 7:System.out.print(" bay muoi");
				break;
			case 8:System.out.print(" tam muoi");
				break;
			case 9:System.out.print(" chin muoi");
				break;
			}
			switch (units) {
			case 0:System.out.print("");
			break;
			case 1:System.out.print(" mot");
				break;
			case 2:System.out.print(" hai");
				break;
			case 3:System.out.print(" ba");
				break;
			case 4:System.out.print(" bon");
				break;
			case 5:System.out.print(" lam");
				break;
			case 6:System.out.print(" sau");
				break;
			case 7:System.out.print(" bay");
				break;
			case 8:System.out.print(" tam");
				break;
			case 9:System.out.print(" chin");
				break;
			}
	}
}
