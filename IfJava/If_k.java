package IfJava;

import java.util.Scanner;

public class If_k {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3,numMax=0;
        System.out.print("Enter number 1st: ");
        num1 =input.nextInt();
        System.out.print("Enter number 2: ");
        num2 =input.nextInt();
        System.out.print("Enter number 3th: ");
        num3 =input.nextInt();
        if (num1>=num2&&num2>=num3) 
            numMax=num1;
        if (num2>=num1&&num1>=num3) 
            numMax=num2;
        if (num3>=num2&&num2>=num1) 
            numMax=num3;
        System.out.println(numMax+" la so lon nhat");
    }
}
