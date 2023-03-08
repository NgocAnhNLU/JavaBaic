package switchCaseJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = input.nextDouble();
        System.out.print("Nhap b: ");
        double b = input.nextDouble();
        double x = -b / a;
        
        System.out.println("Phuong trinh can nhap :" + a +
        
        "x+" + b + " = 0.");
        if (a == 0) {
        if (b == 0) {
        System.out.println("Phuong trinh co vo so nghiem ");
        
        } else {
        System.out.println("Phuong trinh vo nghiem");
        
        }
        } else {
        System.out.println("Phuong trinh co nghiem: " +
        
        x);
        
        }
        }
        }