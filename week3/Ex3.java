package week3;

public class Ex3 {
    public static void main(String[] args) {
        int oldFater=35, oldChill=4,i;
        for (i =0; (double)oldFater/oldChill!=2.0; i++) {
            oldChill+=1;
            oldFater+=1;
        }
        System.out.println("sau "+i);
    }
}
