package week3;

public class Ex6UtilsTest {
	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		int stepMax[][] = { { 5, 90 }, { 10, 180 }, { 15, 270 }, { 30, 360 }, { 5, 90 } };
		for (int[] is : stepMax) {
			ex6.printSimCosTangCtang(is[0], is[1]);
			System.out.println("_____________________________________________");

		}

	}
}
