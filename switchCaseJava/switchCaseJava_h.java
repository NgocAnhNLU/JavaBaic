package switchCaseJava;

import java.util.Scanner;

public class switchCaseJava_h {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("input a Char: ");
        char kyTu =input.next().charAt(0);
        switch(kyTu){
            case 'q':
            case 'w':
            case 'e':
            case 'r':
            case 't':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'p':
            case 'l':
            case 'k':
            case 'j':
            case 'h':
            case 'g':
            case 'f':
            case 'd':
            case 's':
            case 'a':
            case 'z':
            case 'x':
            case 'c':
            case 'v':
            case 'b':
            case 'n':
            case 'm': System.out.printf("%c LowwerCase",kyTu); break;
        default: System.out.printf("%c UpperCase",kyTu); break;

        }
    }
}
