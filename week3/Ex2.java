package week3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0, newNum = 0, unit;
        System.out.print("Input number: ");
        num = input.nextInt();
        System.out.printf("số %d ", num);
        do {
            // lấy phần đơn vị
            unit = num % 10;
            // lấy phần nguyên khi chia cho 10 (để giảm 1 chữ số)
            num /= 10;
            // đếm số chữ số
            count += 1;
            // khi num ==0 thì chỉ còn đơn vị, nên cộng thêm phần đơn vị
            newNum = num == 0 ? newNum + unit : (unit + newNum) * 10;

        } while (num > 0);
        System.out.println("Có " + count + " chữ số");
        System.out.printf("số ngược lại là: %d", newNum);

    }
}