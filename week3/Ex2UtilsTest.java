package week3;

public class Ex2UtilsTest {
	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		int arr[] = { 123, -12346789, 0, 321111233, 4564, 1234567891 };
		for (int i : arr) {
			System.out.printf("so %d co %d chu so\n", i, ex2.coutNum(i));
			System.out.printf("so %d co so dao nguoc la %d\n", i, ex2.reverseumber(i));
			System.out.println("------------------------------------");

		}
	}

}
