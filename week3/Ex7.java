package week3;

public class Ex7 {
    public static void main(String[] args) {
        // tăng 1 đơn vị khi vòng lặp nhỏ hoàn thành để tạo cột.
       for (int i = 1; i <= 10; i++) {
        // vòng lặp nhỏ tăng dần số 2 3 4..9 để tạo 1 dòng bảng cửu chương.
        for (int j = 2; j <= 9; j++) {
            System.out.printf("%2d x %2d = %2d|",i,j,i*j);
        }
        // sau khi in xong dòng thì xuống hàng.
        System.out.println("");
       }
    }
    
}
