package week4;

import java.util.Iterator;

public class Ex1UtlisTest {
	public static void main(String[] args) {
		Ex1 ex1 =new Ex1();
		int[][] arr = {{1,2,3,4,5,6,7,8,9},
		{-10,-300,600,345,0},
		{1,2,3,4,5,6,7,9,9,9,8,9,8}};
		for (int[] is : arr) {
			System.out.print("chuoi: ");
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.printf("\nso lon nhat trong chuoi la: %d ",ex1.maxNumInArr(is));
			System.out.printf(" o vi tri so: ");
			ex1.findIndex(is, ex1.maxNumInArr(is));
			System.out.printf("so nho nhat trong chuoi la: %d",ex1.minNumInArr(is));
			System.out.printf(" o vi tri so: ");
			ex1.findIndex(is, ex1.minNumInArr(is));
			System.out.printf("Tong cac phan tu co trong day la: %d", ex1.sumArr(is));
			System.out.println("\n_____________________________________________________");
		}
	}
}
