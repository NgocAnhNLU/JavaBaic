package week3;

public class Ex6 {
	public void printSimCosTangCtang(int step, int max) {
		
        System.out.printf("    |   Sin   |   cos   |   Tang   |   Cotang |\n");
        for (int i = 0; i <= max; i += step) {
            System.out.printf("%4d|%9.4f|%9.4f|%10.5f|%10.5f|\n", i, Math.sin(i), Math.cos(i), Math.tan(i),
                    Math.pow(Math.tan(i), -1));

        }
    }
}
