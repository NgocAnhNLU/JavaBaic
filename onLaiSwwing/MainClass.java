package onLaiSwwing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {
    private JFrame frame;
    private JLabel label;
    private JButton button;

    public MainClass() {
        // Tạo cửa sổ ứng dụng
        frame = new JFrame("Java Swing Application");

        // Thiết lập kích thước và định cấu hình của cửa sổ
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo và thiết lập các thành phần giao diện
        label = new JLabel("Hello, World!");
        button = new JButton("Click Me!");

        // Đặt vị trí và kích thước của các thành phần
        label.setBounds(50, 50, 200, 20);
        button.setBounds(100, 100, 100, 30);

        // Thêm các thành phần vào cửa sổ
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);

        // Thêm xử lý sự kiện cho nút button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Hiển thị cửa sổ
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
