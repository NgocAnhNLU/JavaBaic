package week5;

public class Ex7 {

	public static void printPascalTriangle(int n) {
		if (n > 0) {
			int[][] triangle = new int[n + 1][n + 1];
			// vòng lặp số
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j < i; j++) {
					if (j == 0 || j == i) {
						triangle[i][j] = 1;
					} else {
						triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
					}
					System.out.print(triangle[i][j] + " ");
				}
				System.out.println();
			}
		}
		else {
			  System.out.println("khong in ddc so am");
		}
	}

}
