package week3;
import java.util.Scanner;

public class Ex5 {
    public static int euGcdOdd(int a,int b) {
        int temp;
        while (b!=0) {
            temp=b;
            b=a%b;
            a=temp;
        }
        // vong lap de day so le
        while (a%2==0){
             a/=2;
        }
        return a;   
    }
    public static  boolean primeNum(int num) {
        for(int i=1;i<=(int)Math.sqrt(num);i++){
            if (num%i!=0) 
                return true;
            else{
                return false;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int num1,num2,gcdOdd,lcm;
    
        Scanner input =new Scanner(System.in);
        System.out.print("input number 1:");
        num1=input.nextInt();
        System.out.print("Input number 2:");
        num2=input.nextInt();
        gcdOdd =euGcdOdd(num1, num2);
        // lcm=(num1*num2)/gcd;
        System.out.printf("hai so %d vs %d co UCCL la: %d\n",num1,num2,gcdOdd);
        // System.out.printf("hai so %d vs %d co BCNN la: %d",num1,num2,lcm);
        System.out.println(primeNum(gcdOdd));


    }
    }
    
