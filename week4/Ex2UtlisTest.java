package week4;

public class Ex2UtlisTest {
	public static void main(String[] args) {
		Ex2 ex2 =new Ex2();
		int[][] arr = {
				{1,2,3,4,5,6,7,8,9,9,9,9},
				{-100,0,100},
				{-100,-80,-80,-90,-80}};
		for (int[] is : arr) {
			System.out.print("Chuoi: ");
			for (int is2 : is) {
				System.out.print(" "+is2);
			}
			System.out.printf("\nso lon nhat trong day la %d xuat hien %d lan\n",ex2.maxNumInArr(is),ex2.coutNum(is, ex2.maxNumInArr(is)));
			System.out.println("__________________________________________________");
		}
	}

}
