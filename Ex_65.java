import java.util.Scanner;

public class Ex_65 {
    public static void main(String[] args) {
        int start,end,sum=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter hour start: ");
        start = input.nextInt();
        System.out.print("Enter hour end: ");
        end = input.nextInt();
        //loop cout money, check hour and add ()
        for(int i=start;i<end;i++){
            if(i<17)
                sum+=2500;
            else
                sum+=3000;
        }
        System.out.println("so tien la: "+sum);
    
}
}

