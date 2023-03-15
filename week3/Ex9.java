package week3;

public class Ex9 {
	public double money(double P, double n, double r) {
		double F;
		if (P > 0 && n > 0) {
			F = P * Math.pow((1 + r / 100), n);
			return F;
		} else {
			System.out.println("loi nhap gia tri");
			return 0;
		}
	}
}
