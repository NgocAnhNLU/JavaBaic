package demoGitHub;

import java.util.Scanner;

public class If_f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a char: ");
        char kyTu =input.next().charAt(0);
        switch(kyTu){
            case 'e':
            case 'a':
            case 'i':
            case 'o':
            case 'u': System.out.println("Vowel"); break;
            case 'q':
            case 'w':
            case 'r':
            case 't':
            case 'y':
            case 'p':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'b':
            case 'v':
            case 'c':
            case 'x':
            case 'z': System.out.println("Cononant"); break;
        }


    }
}
