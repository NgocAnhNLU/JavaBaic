package week5;

public class Ex7UtlisTest {
    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        int[] number = { -3, 0, 1, 5, 9 };
        for (int i : number) {
            ex7.printPascalTriangle(i);
            System.out.println("_________________");
        }
    }
}
