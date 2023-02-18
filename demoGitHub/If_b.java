package demoGitHub;

import java.util.Scanner;

public class If_b {
    public static void main(String[] args) {
        boolean isRaining;
        Scanner input =new Scanner(System.in);
        System.out.print("input");
        isRaining =input.nextBoolean();
        if (isRaining==true) {
            System.out.println("Remember to bring an umbrella");
            
        }
        else{
            System.out.println("Enjoy the sunshine");

        }
    }
}
