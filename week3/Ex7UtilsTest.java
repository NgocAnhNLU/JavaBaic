package week3;

public class Ex7UtilsTest {
	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		int rowColumn[][] = { { 10, 9 }, { 12, 10 }, { 10, 9 } };
		for (int[] is : rowColumn) {
			ex7.printBangCuuChuong(is[0], is[1]);
			System.out.println("_______________________________________________________________________________________________________________________");
		}

	}
}
