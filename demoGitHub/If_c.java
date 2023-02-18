package demoGitHub;

import java.util.Scanner;

public class If_c {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("input Positive:");
        boolean isPositive;
        isPositive = input.nextBoolean();
        if(isPositive==true)
        {
            System.out.print("The number is Positive\n");
        }
        else
            System.out.print("The number is negavive\n");
    }
}
