package DeoGitHub;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Input a Number: ");
        int Number = input.nextInt();
        if(Number>10){
            System.out.printf("Number %d is greater than 10\n",Number);
        }
        else{
            System.out.printf("Number %d is less than or equal to 10\n",Number);

        }
    }
    
}
