package week3;

import java.util.Scanner;

public class Ex4 {
    // hàm Thuật toán Euclid tìm Ucln
    public static int euGcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1, num2, gcd, lcm;
        Scanner input = new Scanner(System.in);
        System.out.print("input number 1:");
        num1 = input.nextInt();
        System.out.print("Input number 2:");
        num2 = input.nextInt();
        gcd = euGcd(num1, num2);
        // mối liên hệ Gcd vs Lcm
        lcm = (num1 * num2) / gcd;
        System.out.printf("hai số %d với %d có UCCL là: %d\n", num1, num2, gcd);
        System.out.printf("hai số %d với %d BCNN là: %d", num1, num2, lcm);

    }
}
