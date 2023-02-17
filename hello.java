import java.util.Scanner;
public class hello {
  public static void main(String[] args) {
    System.out.print("nhap vao so nam sinh cua ban: ");
    Scanner obj = new Scanner(System.in);
    int n= obj.nextInt();
    n=2023-n;
    System.out.println("so tuoi cua ban la: " +n);
  }
}
