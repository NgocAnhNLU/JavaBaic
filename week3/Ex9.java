package week3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double r,F,P;
        int n;
        System.out.print("nhap so tien nhap(P): ");
        P=input.nextDouble();
        System.out.print("nhap so thang nhap(n): ");
        n=input.nextInt();
        System.out.print("nhap vao lai suat hang thang(r): ");
        r=input.nextDouble();
        F=P*Math.pow(1+r, n);
        System.out.println(F);
    }
}
