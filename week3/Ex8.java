package week3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n,sum=0,fac=1;
        System.out.print("input a number: ");
        n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum+=i;
            fac*=i;
        }
        System.out.println("tong cua day :"+sum);
        System.out.println("giai thua cua day: "+fac);

    }
}
