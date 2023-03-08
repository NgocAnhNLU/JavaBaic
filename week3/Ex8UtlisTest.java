package week3;

public class Ex8UtlisTest {
	public static void main(String[] args) {
		int num[]= {4,7,9,-10,13};
		Ex8 ex8 = new Ex8();
		for (int i : num) {
			System.out.printf("tong cua day tu 1-> %d la: %d\n",i,ex8.sumArr(i));
			System.out.printf("tich dai thua tu 1-> %d la: %.0f\n",i,ex8.fact(i));
			System.out.println("_________________________________");
		}
	}

}
