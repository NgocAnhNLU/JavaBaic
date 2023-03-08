package week3;

public class Ex1UtilsTest {
	public static void main(String[] args) {
		int[][] arr = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0 },
				{ -32212, 23332, 424, 4, 5, 6, 7, 8, 9, 10, 0 },
				{1,4,7,-3,-6,8,4,7,4,0}
				};
		Ex1 ex1 =new Ex1();
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println("\ntong cua chuoi la: "+ex1.sumOfArr(is));
			System.out.println("trung binh cua chuoi la: "+ex1.averageOfArr(is));
			System.out.println("so lon nhat co trong chuoi la: "+ex1.maxNumInArr(is));
			System.out.println("-------------------------------------");
			
		}
	}
	}
