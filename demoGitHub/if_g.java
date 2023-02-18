package demoGitHub;

import java.util.Scanner;

public class if_g {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Input a number: ");
        int num= input.nextInt();
        if (num%2==0) {
            System.out.printf("number %d is Even "num);
        }
        else
            System.out.printf("number %d is Odd",num);
    }
}
