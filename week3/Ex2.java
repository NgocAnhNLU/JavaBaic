package week3;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num,count=0,newNum=0,unit;
        System.out.print("Input number: ");
        num=input.nextInt();
        System.out.printf("so %d ",num);
        do{
            unit=num%10;
            num/=10;
            count+=1;
            newNum=num>0?(unit+newNum)*10:newNum+unit;
            
        }while(num>0);
        System.out.println("co "+count +"chu so");
        System.out.printf("so nguoc la:%d",newNum);

    }
}